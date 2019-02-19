package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table(name="`match`")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * First Team
     */
    @ManyToOne
    private Team aTeam;

    /**
     * Second Team
     */
    @ManyToOne
    private Team bTeam;

    /**
     * First Team's score
     */
    private int aScore;

    /**
     * Second Team's score
     */
    private int bScore;

    public Match(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
