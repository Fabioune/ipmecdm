package fr.ipme.coupe.service;

import org.springframework.stereotype.Service;

@Service
public class MatchEliminatoireService extends MatchService{
    public MatchEliminatoireService(){}

    public void play(){

        this.playMatch();

        // if draw, add point to first, yeaaaah that's bad =)
        if(this.match.getaScore()== this.match.getbScore()){
            this.match.setaScore(this.match.getaScore() + 1);
        }

        matchRepository.save(match);

        // checks pronostics now that game is over
        pronosticCheckerService.asignPronosticPointsByMatch(match);
    }
}
