package com.greenfox.pkrisz0.frontend.model;

public class Double {
    int received;
    int result;

    public Double() {

    }

    public Double(int received) {
        this.received = received;
        this.result = received * 2;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
