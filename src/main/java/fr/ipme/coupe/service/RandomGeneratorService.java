package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Country;
import fr.ipme.coupe.model.Group;
import fr.ipme.coupe.model.Team;
import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.GroupRepository;
import fr.ipme.coupe.repository.TeamRepository;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RandomGeneratorService {

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private UserRepository userRepository;

    /**
     * Recreate all team and assign random (20 -> 100) atk and def
     * @param groups
     * @param countries
     * @return
     */
    public List<Group> randomTeamGroupsAndStats(List<Group> groups,  List<Country> countries)
    {
        int teamByGroup = 4;
        int offset = 0;
        int offsetMax = 0;

        List<Team> teamToSave = new ArrayList<>();

        for (int j = 0; j < groups.size(); j++) {
            offsetMax += teamByGroup;
            for (int i = offset; i < offsetMax; i++) {
                Team team = new Team();
                team.setGroup(groups.get(j));
                team.setCountry(countries.get(i));
                team.setAttack(Math.max((int) (Math.random() * 100), 20));
                team.setDefence(Math.max((int) (Math.random() * 100), 20));
                teamToSave.add(team);
            }
            offset += teamByGroup;
        }

        // Save iterable
        teamRepository.saveAll(teamToSave);

        // not sure if returned groupRepo is updated, so let's reload it
        return groupRepository.findAll();
    }

    /**
     * Create basic set of Users
     * @return
     */
    public List<User> generateRandomsUsers()
    {
        List<User> toSave = new ArrayList<User>();

        // create admin first
        User admin = new User();
        admin.setName("Admin");
        admin.setEmail("admin@example.org");
        admin.setPassword("SALTME.password");
        admin.setAge(30);
        admin.setAccountLevel(20);
        toSave.add(admin);

        // create basic users
        User basicUser = new User();
        basicUser.setName("Pierre");
        basicUser.setEmail("pierre@example.org");
        basicUser.setPassword("SALTME.password");
        basicUser.setAge(18);
        basicUser.setAccountLevel(10);
        toSave.add(basicUser);

        User basicUser2 = new User();
        basicUser2.setName("Jean");
        basicUser2.setEmail("jean@example.org");
        basicUser2.setPassword("SALTME.password");
        basicUser2.setAge(60);
        basicUser2.setAccountLevel(10);
        toSave.add(basicUser2);

        User basicUser3 = new User();
        basicUser3.setName("Christophe");
        basicUser3.setEmail("christophe@example.org");
        basicUser3.setPassword("SALTME.password");
        basicUser3.setAge(25);
        basicUser3.setAccountLevel(10);
        toSave.add(basicUser3);

        User basicUser4 = new User();
        basicUser4.setName("Stephane");
        basicUser4.setEmail("stephane@example.org");
        basicUser4.setPassword("SALTME.password");
        basicUser4.setAge(15);
        basicUser4.setAccountLevel(10);
        toSave.add(basicUser4);

        userRepository.saveAll(toSave);

        return userRepository.findAll();
    }
}
