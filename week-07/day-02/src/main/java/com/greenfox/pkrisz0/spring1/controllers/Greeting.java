package com.greenfox.pkrisz0.spring1.controllers;

public class Greeting {

    long id;
    String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
