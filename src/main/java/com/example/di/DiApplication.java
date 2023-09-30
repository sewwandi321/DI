package com.example.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        alien.show();

        Alien alien2 = context.getBean(Alien.class);
        alien2.show();

    }

}
