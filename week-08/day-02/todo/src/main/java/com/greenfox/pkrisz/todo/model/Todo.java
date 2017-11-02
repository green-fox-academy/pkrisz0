package com.greenfox.pkrisz.todo.model;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    String title;
    boolean urgent;
    boolean done;

    @ManyToOne (cascade =CascadeType.ALL)
    Assignee assignee;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public boolean isUrgent() {
        return urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }


    @Override
    public String toString() {
        return title;
    }
}
