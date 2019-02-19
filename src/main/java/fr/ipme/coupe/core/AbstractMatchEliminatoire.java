package fr.ipme.coupe.core;

import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.MatchEliminatoire;
import fr.ipme.coupe.model.Team;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AbstractMatchEliminatoire {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private int time;

    private int currentTime;

    private MatchEliminatoire aResult;

    private MatchEliminatoire bResult;

    private Team aTeam;

    private Team bTeam;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public MatchEliminatoire getaResult() {
        return aResult;
    }

    public void setaResult(MatchEliminatoire aResult) {
        this.aResult = aResult;
    }

    public MatchEliminatoire getbResult() {
        return bResult;
    }

    public void setbResult(MatchEliminatoire bResult) {
        this.bResult = bResult;
    }

    public Team getaTeam() {
        return aTeam;
    }

    public void setaTeam(Team aTeam) {
        this.aTeam = aTeam;
    }

    public Team getbTeam() {
        return bTeam;
    }

    public void setbTeam(Team bTeam) {
        this.bTeam = bTeam;
    }
}
