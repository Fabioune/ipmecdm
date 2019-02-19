package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table(name="`match`")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    /** First Team's point
     *
     */
    private int aPoint;

    /** Second Team's point
     *
     */

    private int bPoint;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getaPoint() {
        return aPoint;
    }

    public void setaPoint(int aPoint) {
        this.aPoint = aPoint;
    }

    public int getbPoint() {
        return bPoint;
    }

    public void setbPoint(int bPoint) {
        this.bPoint = bPoint;
    }


    public Match(){}

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", aTeam=" + aTeam +
                ", bTeam=" + bTeam +
                ", aScore=" + aScore +
                ", bScore=" + bScore +
                ", aPoint=" + aPoint +
                ", bPoint=" + bPoint +
                '}';
    }
}
