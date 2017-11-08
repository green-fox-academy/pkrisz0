package come.greenfox.pkrisz0.guardians.config;

import come.greenfox.pkrisz0.guardians.model.Ship;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShipConfig {

    @Bean
    public Ship ship(){
        return new Ship();
    }
}
