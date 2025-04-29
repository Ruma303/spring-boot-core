package com.example.demo.beans;

import org.springframework.context.annotation.*;

@Configuration
public class Message {

    @Bean(name = "greetings")
    public String greetings() {
        return "Saluti";
    }

    @Bean(name = "goodMorning")
    public String goodMorning() {
        return "Buongiorno";
    }

    @Bean(name = "goodbye")
    public String goodbye() {
        return "Arrivederci";
    }
}
