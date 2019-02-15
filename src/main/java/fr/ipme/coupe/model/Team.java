package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Country linked to team
     */
    @ManyToOne
    private Country country;

    /**
     * Current group of team
     */
    @ManyToOne
    private Group group;


}
