package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table(name="`groups`")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Name of group, Probably A, B, C ...
     */
    private char name;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
