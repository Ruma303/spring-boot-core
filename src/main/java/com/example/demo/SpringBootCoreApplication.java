package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreApplication {

    public static void main(String[] args) {

        // 1. Creazione contesto ApplicationContext.
        ApplicationContext context = SpringApplication.run(SpringBootCoreApplication.class, args);

    }
}