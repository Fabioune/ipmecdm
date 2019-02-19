package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class MatchPouleService extends MatchService {

    protected Match match;

    @Autowired
    TeamRepository teamRepository;

    public MatchPouleService() {
    }

    public MatchPouleService(Match match) {
        this.match = match;
    }

    public void play(){

        for (int i=0; i<=(this.match.getTime())+(int)(Math.random()*5); i++){

            if(Math.random()<0.5){

                if((int)(Math.random()*0.1*this.match.getaTeam().getAttack())>(int)(Math.random()*0.1*this.match.getbTeam().getDefence())){
                    this.match.setaScore(this.match.getaScore()+1);

                }
                if((int)(Math.random()*0.1*this.match.getbTeam().getAttack())>(int)(Math.random()*0.1*this.match.getaTeam().getDefence())){
                    this.match.setbScore(this.match.getbScore()+1);
                }



            }
        }

        if(this.match.getaScore() == this.match.getbScore()) {
            this.match.getaTeam().setPointGroupTeam(this.match.getaTeam().getPointGroupTeam() + 1);
            this.match.getbTeam().setPointGroupTeam(this.match.getbTeam().getPointGroupTeam() + 1);
            teamRepository.save(this.match.getaTeam());
            teamRepository.save(this.match.getbTeam());

        }

        else if(this.match.getaScore() > this.match.getbScore()){
            this.match.getaTeam().setPointGroupTeam(this.match.getaTeam().getPointGroupTeam()+ 3);
            teamRepository.save(this.match.getaTeam());
        }

        else {
            this.match.getbTeam().setPointGroupTeam(this.match.getbTeam().getPointGroupTeam() + 3);
            teamRepository.save(this.match.getbTeam());
        }

        matchRepository.save(match);


    }
}
