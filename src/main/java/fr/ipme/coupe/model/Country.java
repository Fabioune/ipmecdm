package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Country full name
     */
    private String name;


    /**
     * Short name for display (ex : FRA - BRA)
     */
    private String shortName;

}
