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

    /**
     * Atk force
     */
    private int attack;

    /**
     * Def
     */
    private int defence;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public Team(){}
}
