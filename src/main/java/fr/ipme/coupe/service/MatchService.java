package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.MatchRepository;
import fr.ipme.coupe.repository.PronosticRepository;
import fr.ipme.coupe.repository.TeamRepository;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class MatchService {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    protected UserService userService;

    @Autowired
    protected TeamRepository teamRepository;

    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected PronosticRepository pronosticRepository;

    @Autowired
    protected fr.ipme.coupe.service.PronosticCheckerService pronosticCheckerService;

    protected Match match;


    public void setMatch(Match match) {
        this.match = match;
    }

    /**
     * Start first set of world cut
     * For test purpose, also play all match at the same time
     * and generate random pronostics for all users
     */
    protected void playMatch()
    {
        // save match to allow saving pronostics
        matchRepository.save(this.match);

        // generate and save all pronostics
        List<User> betters = userRepository.findAll();

        for (int i = 0; i < betters.size(); i++) {
            userService.generateRandomPronosticForMatch(betters.get(i), this.match);
        }


        for (int i = 0; i <= 90 + (int) (Math.random() * 5); i++) {
            // some random asignemnts
            // Basicly, this mean that there is a .05% chance that someone score's.
            // Then, depending on atk and def and some random values added, atk is compared to def to define if teamX score
            // That allow to have score around between 0-6
            if(Math.random() < .05){
                if((int) (Math.random() * this.match.getaTeam().getAttack()) > (int) (Math.random() * this.match.getbTeam().getDefence())){
                    this.match.setaScore(this.match.getaScore()+1);
                }

                if((int) (Math.random() * this.match.getbTeam().getAttack()) > (int) (Math.random() * this.match.getaTeam().getDefence())){
                    this.match.setbScore(this.match.getbScore()+1);
                }
            }
        }

    }
}
