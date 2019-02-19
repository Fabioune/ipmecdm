package fr.ipme.coupe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="`matchEliminatoire`")
@JsonIgnoreProperties("hibernateLazyInitializer")
public class MatchEliminatoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * First Team
     */
    @ManyToOne
    private Team aTeam;

    /**
     * Second Team
     */
    @ManyToOne
    private Team bTeam;

    /**
     * First Team's score
     */
    private boolean aResult;

    /**
     * Second Team's score
     */
    private boolean bResult;

    public MatchEliminatoire(){}

}


