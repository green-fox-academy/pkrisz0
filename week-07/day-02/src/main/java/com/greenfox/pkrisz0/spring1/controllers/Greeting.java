package com.greenfox.pkrisz0.spring1.controllers;
import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    long id;
    String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting(long id, String content, String name) {
        this.id = id;
        this.content = content + name + "!";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
