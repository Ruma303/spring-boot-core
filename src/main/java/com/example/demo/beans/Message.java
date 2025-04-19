package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Message {
    public String greetings = "Saluti";
    public String goodMorning = "Buongiorno";
    public String goodbye = "Arrivederci";

    public String getGreetings() {
        return greetings;
    }
    public String getGoodMorning() {
        return goodMorning;
    }

    public String getGoodbye() {
        return goodbye;
    }

}