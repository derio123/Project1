package com.derio.aula1.entitty;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.derio.model")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
