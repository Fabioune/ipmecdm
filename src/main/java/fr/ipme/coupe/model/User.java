package fr.ipme.coupe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;

@Entity
@Table
@JsonIgnoreProperties("hibernateLazyInitializer")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String name;

    protected int age;

    protected String email;

    protected String password;

    protected int accountLevel;

    public int getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(int accountLevel) {
        this.accountLevel = accountLevel;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
    public User() {}

}
