package com.greenfox.pkrisz.todo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    String title;
    boolean urgent;
    boolean done;

    @DateTimeFormat(pattern = "mm/dd/yyyy")
    LocalDate created;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate due;

    @ManyToOne (cascade =CascadeType.ALL)
    Assignee assignee;

    public Todo() {
        this.created = LocalDate.now();
        this.due = created;
    }

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
        this.created = LocalDate.now();
        this.due = created;
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


    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getDue() {
        return due;
    }

    public void setDue(LocalDate due) {
        this.due = due;
    }

    @Override
    public String toString() {
        return title;
    }
}
