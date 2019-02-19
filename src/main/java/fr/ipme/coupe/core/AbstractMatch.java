package fr.ipme.coupe.core;


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

    private int scoreTeamA;

    private int scoreTeamB;

    private Team teamA;

    private Team teamB;

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

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    @Override
    public String toString() {
        return "AbstractMatch{" +
                "id=" + id +
                ", time=" + time +
                ", currentTime=" + currentTime +
                ", scoreTeamA=" + scoreTeamA +
                ", scoreTeamB=" + scoreTeamB +
                ", teamA=" + teamA +
                ", teamB=" + teamB +
                '}';
    }
}
