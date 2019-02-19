package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Team;

public class MatchPouleService extends MatchService {

    protected Match match;

    public MatchPouleService() {
    }

    public MatchPouleService(Match match) {
        this.match = match;
    }
}
