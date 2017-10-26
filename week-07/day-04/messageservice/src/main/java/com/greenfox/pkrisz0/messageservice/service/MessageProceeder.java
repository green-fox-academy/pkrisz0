package com.greenfox.pkrisz0.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

    @Autowired
    MessageService messageService;

    public void processMessage(String message, String address){
        messageService.send(message, address);
    }
}
