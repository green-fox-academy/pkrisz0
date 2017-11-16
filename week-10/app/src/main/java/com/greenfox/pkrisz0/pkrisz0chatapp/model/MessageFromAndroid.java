package com.greenfox.pkrisz0.pkrisz0chatapp.model;

import java.util.ArrayList;

/**
 * Created by Sir Robin on 2017. 11. 16..
 */

public class MessageFromAndroid {
    ArrayList<Message> messages;
    Client client;

    public MessageFromAndroid() {
    }

    public MessageFromAndroid(ArrayList<Message> messages, Client client) {
        this.messages = messages;
        this.client = client;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
