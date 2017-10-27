package com.greenfox.pkrisz.foxclub.config;

import com.greenfox.pkrisz.foxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class FoxConfig {

    @Bean
    public Fox fox() {
        return new Fox("Mr.Green", Arrays.asList("extensive knowledge of italian neorealist cinema", "Java"),"pizza", "green tea");
    }
}
