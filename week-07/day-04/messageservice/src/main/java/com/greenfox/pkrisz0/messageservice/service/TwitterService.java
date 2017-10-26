package com.greenfox.pkrisz0.messageservice.service;

public class TwitterService implements MessageService {

    @Override
    public void send(String message, String address) {
        System.out.println("Tweet sent to" + address + " with the message " + message);
    }
}
