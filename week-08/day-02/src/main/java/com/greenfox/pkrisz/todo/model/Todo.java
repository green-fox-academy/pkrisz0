package com.greenfox.pkrisz.todo.model;

public class Todo {

    int id;
    String title;
    boolean isUrgent;
    boolean isDone;

    public Todo(int id, String title, boolean isUrgent, boolean isDone) {
        this.id = id;
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }
}
