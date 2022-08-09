package com.example.cataappdemo.entity;


import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long  id;
    private String name;
    private String email;
    private String accesType;

    public User(String name, String email, String accesType) {
        this.name = name;
        this.email = email;
        this.accesType = accesType;
    }

    public Long getId() {
        return id;
    }

    public User() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccesType() {
        return accesType;
    }

    public void setAccesType(String accesType) {
        this.accesType = accesType;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", accesType=" + accesType +
                '}';
    }
}
