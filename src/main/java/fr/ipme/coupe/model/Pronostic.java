package fr.ipme.coupe.model;

import fr.ipme.coupe.core.ModelInterface;

import javax.persistence.*;

@Entity
@Table
public class Pronostic implements ModelInterface {

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

    @ManyToOne
    private Match match;

    public long getId() {
        return id;
    }

    @Override
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

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
