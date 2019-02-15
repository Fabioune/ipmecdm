package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table
public class Pronostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
}
