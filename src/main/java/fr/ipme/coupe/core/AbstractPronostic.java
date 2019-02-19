package fr.ipme.coupe.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

abstract class AbstractPronostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private boolean team1;
    private boolean team2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isTeam1() {
        return team1;
    }

    public void setTeam1(boolean team1) {
        this.team1 = team1;
    }

    public boolean isTeam2() {
        return team2;
    }

    public void setTeam2(boolean team2) {
        this.team2 = team2;
    }
}
