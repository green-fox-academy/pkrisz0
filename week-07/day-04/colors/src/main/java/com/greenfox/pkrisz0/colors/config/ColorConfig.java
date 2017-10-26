package com.greenfox.pkrisz0.colors.config;

import com.greenfox.pkrisz0.colors.model.RedColor;
import com.greenfox.pkrisz0.colors.model.YellowColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

    @Bean
    public RedColor redColorEr() {
        return new RedColor();
    }

    @Bean
    public YellowColor yellowColorColorEr() {
        return new YellowColor();
    }
}
