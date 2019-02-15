package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String shortName;

    @ManyToOne
    private Country country;


    @ManyToOne
    private Group group;


}
