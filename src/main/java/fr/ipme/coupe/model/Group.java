package fr.ipme.coupe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fr.ipme.coupe.core.ModelInterface;

import javax.persistence.*;

@Entity
@Table(name="`groups`")
@JsonIgnoreProperties("hibernateLazyInitializer")
public class Group implements ModelInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Name of group, Probably A, B, C ...
     */
    private char name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public Group(){}

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
