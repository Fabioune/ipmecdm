package fr.ipme.coupe.model;

import javax.persistence.*;

@Entity
@Table

public class PronosticEliminatoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean aResult;
    
    private boolean bResult;

    public PronosticEliminatoire(){}
}
