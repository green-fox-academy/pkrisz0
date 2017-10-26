package com.greenfox.pkrisz0.messageservice.service;

public class EmailService implements MessageService {

    @Override
    public void send(String message, String address) {
        System.out.println("Email sent to" + address + " with the message " + message);
    }
}
