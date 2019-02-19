package fr.ipme.coupe.service;


import fr.ipme.coupe.model.Group;
import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Team;
import fr.ipme.coupe.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {


    @Autowired
    GroupRepository groupRepository;

    @Autowired
    MatchPouleService matchPouleService;

    public void launchPool() {

        List<Group> groups = groupRepository.findAll();



        for (int i = 0; i < groups.size() ; i++) {
            List<Team> teams = groupRepository.findTeamsByGroup(groups.get(i).getId());
            for (int j = 0; j < teams.size(); j++) {

                for (int k = j+1; k <teams.size() ; k++) {
                    Match match = new Match();
                    match.setaTeam(teams.get(j));
                    match.setbTeam(teams.get(k));

                    matchPouleService.setMatch(match);
                    matchPouleService.play();

                }
    

            }

        }


    }
}
