package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import org.springframework.stereotype.Service;


@Service
public class MatchPouleService extends MatchService {

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

        matchRepository.save(match);

        // checks pronostics now that game is over
        pronosticCheckerService.asignPronosticPointsByMatch(match);
    }

}
