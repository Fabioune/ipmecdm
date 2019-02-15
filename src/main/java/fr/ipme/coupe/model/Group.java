package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table(name="`group`")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


}
