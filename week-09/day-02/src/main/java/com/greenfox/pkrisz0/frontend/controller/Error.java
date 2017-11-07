package com.greenfox.pkrisz0.frontend.controller;

public class Error {
    String error;


    public Error() {
        this.error = "Please provide an input!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
