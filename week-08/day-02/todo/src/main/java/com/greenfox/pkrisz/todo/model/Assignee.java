package com.greenfox.pkrisz.todo.model;

import javax.persistence.*;

@Entity
@Table(name="assignees")
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;
    String email;

    public Assignee() {
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return  name;
    }
}
