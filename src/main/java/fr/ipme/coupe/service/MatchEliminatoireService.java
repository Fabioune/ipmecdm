package fr.ipme.coupe.service;


import fr.ipme.coupe.model.Match;
import org.springframework.stereotype.Service;

@Service
public class MatchEliminatoireService extends MatchService{


    protected Match match;



    public MatchEliminatoireService(){}


    public MatchEliminatoireService(Match match){

        this.match=match;

    }

    public void play(){

        for (int i=0; i<=(90)+(int)(Math.random()*5); i++){

            if(Math.random()<0.5){

                if((int)(Math.random()*0.1*this.match.getaTeam().getAttack())>(int)(Math.random()*0.1*this.match.getbTeam().getDefence())){
                    this.match.setaScore(this.match.getaScore()+1);

                }
                if((int)(Math.random()*0.1*this.match.getbTeam().getAttack())>(int)(Math.random()*0.1*this.match.getaTeam().getDefence())){
                    this.match.setbScore(this.match.getbScore()+1);
                }



            }


        }

        if(this.match.getaScore()== this.match.getbScore()){

            this.match.setaScore(this.match.getaScore()+1);
        }

        matchRepository.save(match);

    }
}
