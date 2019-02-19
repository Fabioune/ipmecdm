package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table(name="`matchEliminatoire`")

public class MatchEliminatoire {

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
    private boolean aResult;


    /**
     * Second Team's score
     */
    private boolean bResult;

    public MatchEliminatoire(){}



}


