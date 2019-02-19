package fr.ipme.coupe.service;


import fr.ipme.coupe.model.Group;
import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.MatchEliminatoire;
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

    @Autowired
    MatchEliminatoireService matchEliminatoireService;

    public void launchPoule() {

        List<Group> groups = groupRepository.findAll();

        for (int i = 0; i < groups.size() ; i++) {
            List<Team> teams = groupRepository.findTeamsByGroup(groups.get(i).getId());
            for (int j = 0; j < teams.size(); j++) {
                for (int k = j + 1; k < teams.size(); k++) {
                    Match match = new Match();
                    match.setaTeam(teams.get(j));
                    match.setbTeam(teams.get(k));

                    matchPouleService.setMatch(match);
                    matchPouleService.play();
                }
            }
        }
    }

    public void launchEliminations() {

        List<Group> groups = groupRepository.findAll();

        for (int i = 0; i < groups.size() ; i++) {
            List<Team> teams = groupRepository.getRankings();

            for (int j = 0; j < teams.size(); j = j + 2) {
                // get first two team of each groups

                MatchEliminatoire matchEliminatoire = new MatchEliminatoire();
                matchEliminatoire.setaTeam(teams.get(j));
                matchEliminatoire.setbTeam(teams.get(j + 1));

                matchEliminatoireService.setMatch(matchEliminatoire);
                matchEliminatoireService.play();

            }
        }
    }
}
