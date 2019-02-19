package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table

public class PronosticEiliminatoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean Team1;

    private boolean Team2;

    @ManyToOne
    private User user;

    @ManyToOne
    private Team aTeam;

    @ManyToOne
    private Team bTeam;

    public PronosticEiliminatoire(){}
}
