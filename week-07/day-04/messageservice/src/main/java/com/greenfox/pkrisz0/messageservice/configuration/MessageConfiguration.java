package com.greenfox.pkrisz0.messageservice.configuration;

import com.greenfox.pkrisz0.messageservice.service.EmailService;
import com.greenfox.pkrisz0.messageservice.service.MessageProceeder;
import com.greenfox.pkrisz0.messageservice.service.MessageService;
import com.greenfox.pkrisz0.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {
    public MessageService messageService2() {
        return new TwitterService();
    }

    @Bean
    public MessageService messageService() {
        return new EmailService();
    }

    @Bean
    public MessageProceeder messageProceeder() {
        return new MessageProceeder();
    }
}
