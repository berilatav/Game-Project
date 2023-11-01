package org.demo.gameproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableConfigurationProperties
@EnableCaching
@EnableJpaAuditing
@SpringBootApplication
public class GameProject {

    public static void main(String[] args) {
        SpringApplication.run(GameProject.class, args);


    }

}