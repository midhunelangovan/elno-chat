package com.io.sas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("kals.com")
public class SasApplication {

    public static void main(String[] args) {
        SpringApplication.run(SasApplication.class, args);
    }

}
