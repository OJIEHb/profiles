package com.geiko.profiles;

import com.geiko.carParts.Engine;
import com.geiko.carParts.Tyres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Андрей on 09.03.2017.
 */
@Configuration
@Profile("prod")
public class ProdConfig {
    @Bean
    Engine engine(){
        System.out.println("Created prod engine");
        return new Engine();
    }

    @Bean
    Tyres tyres(){
        System.out.println("Created prod tyres");
        return new Tyres();
    }
}
