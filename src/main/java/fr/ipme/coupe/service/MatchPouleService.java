package fr.ipme.coupe.service;

import fr.ipme.coupe.model.Team;

public class MatchPouleService extends MatchService{

    protected Team aTeam;
    protected Team bTeam;

    public MatchPouleService() {
    }

    public MatchPouleService(Team aTeam, Team bTeam) {
        this.aTeam = aTeam;
        this.bTeam = bTeam;
    }
}
