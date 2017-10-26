package com.greenfox.pkrisz0.helloworldbean.config;

import com.greenfox.pkrisz0.helloworldbean.services.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
