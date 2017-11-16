package com.greenfox.pkrisz0.pkrisz0chatapp.model;

/**
 * Created by Sir Robin on 2017. 11. 16..
 */

public class ToBeRecieved {
    Client client;
    Message message;

    public ToBeRecieved() {
    }

    public ToBeRecieved(Client client, Message message) {
        this.client = client;
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
