package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MatchPouleService extends MatchService {

    protected Match match;

    public void setMatch(Match match) {
        this.match = match;
    }

    public MatchPouleService() {}

    public void play()
    {
        // start game
        this.playMatch();

        // Match if played now, let's compare scores
        // and add points for groups
        if(this.match.getaScore() == this.match.getbScore()) {
            this.match.getaTeam().setPointGroupTeam(this.match.getaTeam().getPointGroupTeam() + 1);
            this.match.getbTeam().setPointGroupTeam(this.match.getbTeam().getPointGroupTeam() + 1);
        } else if(this.match.getaScore() > this.match.getbScore()){
            this.match.getaTeam().setPointGroupTeam(this.match.getaTeam().getPointGroupTeam()+ 3);
        } else {
            this.match.getbTeam().setPointGroupTeam(this.match.getbTeam().getPointGroupTeam() + 3);
        }

        // save ...
        teamRepository.save(this.match.getaTeam());
        teamRepository.save(this.match.getbTeam());

        matchRepository.save(this.match);

        // checks pronostics now that game is over
        pronosticCheckerService.asignPronosticPointsByMatch(match);
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
