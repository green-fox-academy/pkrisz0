package com.greenfox.error.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.greenfox.error.model.model.UserService;

@Configuration
public class ThingsConfiguration {

    @Bean
    public UserService service() {
        return new UserService();
    }
}
