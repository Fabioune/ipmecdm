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

    public Match(){}



}
