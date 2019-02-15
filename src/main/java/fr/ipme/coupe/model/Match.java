package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table(name="`match`")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Team aTeam;

    @ManyToOne
    private Team bTeam;

    private int aScore;

    private int bScore;
}
