package fr.ipme.coupe.core;


import fr.ipme.coupe.model.Match;
import fr.ipme.coupe.model.Team;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class AbstractMatch {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private int time;

    private int currentTime;

    private int aScore;

    private int bScore;

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

    public int getaScore() {
        return aScore;
    }

    public void setaScore(int aScore) {
        this.aScore = aScore;
    }

    public int getbScore() {
        return bScore;
    }

    public void setbScore(int bScore) {
        this.bScore = bScore;
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

    @Override
    public String toString() {
        return "AbstractMatch{" +
                ", aTeam=" + aTeam +
                "aScore=" + aScore +
                ", bTeam=" + bTeam +
                ", bScore=" + bScore +
                '}';
    }
}
