package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table
public class Pronostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * First Team PREDICTED score
     */
    private int aScore;

    /**
     * Second Team PREDICTED score
     */
    private int bScore;


    /**
     * User who made this pronostic
     */
    @ManyToOne
    private User user;


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

    public Pronostic(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
