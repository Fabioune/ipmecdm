package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table
public class Pronostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int aScore;

    private int bScore;

    @ManyToOne
    private User user;

    @ManyToOne
    private Team aTeam;

    @ManyToOne
    private Team bTeam;
}
