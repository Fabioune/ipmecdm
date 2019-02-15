package fr.ipme.coupe.model;

import javax.persistence.*;

@Table
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Name of player
     */
    private String name;

    /**
     * Team of player
     */
    @ManyToOne
    private Team team;

    /**
     * Stats of player
     * 0 => ATK
     * 1 => DEF
     */
    private int[] stats;
}
