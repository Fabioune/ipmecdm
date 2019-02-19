package fr.ipme.coupe.model;

import javax.persistence.*;
import java.util.Arrays;

@Table
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Name of player
     */
    private String name;

    /**
     * Team of player
     */
    @ManyToOne
    private Team team;

    /**
     * Stats of player
     * 0 => ATK
     * 1 => DEF
     */
    private int[] stats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int[] getStats() {
        return stats;
    }

    public void setStats(int[] stats) {
        this.stats = stats;
    }

    public Player(){}

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team=" + team +
                ", stats=" + Arrays.toString(stats) +
                '}';
    }
}
