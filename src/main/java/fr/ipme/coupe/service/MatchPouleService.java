package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Pronostic;
import fr.ipme.coupe.model.User;
import fr.ipme.coupe.repository.PronosticRepository;
import fr.ipme.coupe.repository.TeamRepository;
import fr.ipme.coupe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.ipme.coupe.service.*;

import java.util.List;


@Service
public class MatchPouleService extends MatchService {


    @Autowired
    protected TeamRepository teamRepository;

    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected PronosticRepository pronosticRepository;

    @Autowired
    protected fr.ipme.coupe.service.PronosticCheckerService pronosticCheckerService;

    protected Match match;

    public MatchPouleService() {
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public void play()
    {
        // save match to allow saving pronostics
        matchRepository.save(match);

        // generate and save all pronostics
        List<User> betters = userRepository.findAll();

        for (int i = 0; i < betters.size(); i++) {
            Pronostic pronostic = new Pronostic();
            pronostic.setUser(betters.get(i));
            pronostic.setMatch(this.match);
            pronostic.setaScore((int) (Math.random() * 5));
            pronostic.setbScore((int) (Math.random() * 5));

            pronosticRepository.save(pronostic);
        }

        for (int i=0; i<=(90)+(int)(Math.random()*5); i++){

            if(Math.random()<0.05){

                if((int)(Math.random()*0.1*this.match.getaTeam().getAttack())>(int)(Math.random()*0.1*this.match.getbTeam().getDefence())){
                    this.match.setaScore(this.match.getaScore()+1);
                }

                if((int)(Math.random()*0.1*this.match.getbTeam().getAttack())>(int)(Math.random()*0.1*this.match.getaTeam().getDefence())){
                    this.match.setbScore(this.match.getbScore()+1);
                }
            }
        }

        //
        if(this.match.getaScore() == this.match.getbScore()) {
            this.match.getaTeam().setPointGroupTeam(this.match.getaTeam().getPointGroupTeam() + 1);
            this.match.getbTeam().setPointGroupTeam(this.match.getbTeam().getPointGroupTeam() + 1);
            teamRepository.save(this.match.getaTeam());
            teamRepository.save(this.match.getbTeam());
        } else if(this.match.getaScore() > this.match.getbScore()){
            this.match.getaTeam().setPointGroupTeam(this.match.getaTeam().getPointGroupTeam()+ 3);
            teamRepository.save(this.match.getaTeam());
        } else {
            this.match.getbTeam().setPointGroupTeam(this.match.getbTeam().getPointGroupTeam() + 3);
            teamRepository.save(this.match.getbTeam());
        }

        matchRepository.save(match);


//        PronosticCheckerService pronosticCheckerService = new PronosticCheckerService();
        pronosticCheckerService.asignPronosticPointsByMatch(match);
    }
}
