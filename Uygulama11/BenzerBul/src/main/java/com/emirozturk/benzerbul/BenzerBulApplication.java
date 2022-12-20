package com.emirozturk.benzerbul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class BenzerBulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BenzerBulApplication.class, args);
    }

}