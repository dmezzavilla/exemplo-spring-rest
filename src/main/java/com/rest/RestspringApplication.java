package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Daniel Mezzavilla
 */
@SpringBootApplication
@EnableScheduling
public class RestspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestspringApplication.class, args);
    }

}

