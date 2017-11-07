package com.greenfox.pkrisz0.frontend.model;

public class Append {

    String appended;

    public Append(String input) {
        this.appended = input + "a";
    }


    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
