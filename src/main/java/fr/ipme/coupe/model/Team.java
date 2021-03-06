package fr.ipme.coupe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fr.ipme.coupe.core.ModelInterface;

import javax.persistence.*;

@Entity
@Table
@JsonIgnoreProperties("hibernateLazyInitializer")
public class Team implements ModelInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

    private int pointGroupTeam;


    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getPointGroupTeam() {
        return pointGroupTeam;
    }

    public void setPointGroupTeam(int pointGroupTeam) {
        this.pointGroupTeam = pointGroupTeam;
    }

    public Team(){}


    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", country=" + country +
                ", group=" + group +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}
