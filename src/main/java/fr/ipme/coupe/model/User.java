package fr.ipme.coupe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fr.ipme.coupe.core.*;


import javax.persistence.*;

@Entity
@Table
@JsonIgnoreProperties("hibernateLazyInitializer")
public class User extends AbstractUser {

    public User() {}

}
