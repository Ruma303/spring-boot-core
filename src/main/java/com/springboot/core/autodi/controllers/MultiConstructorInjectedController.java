package com.springboot.core.autodi.controllers;

import com.springboot.core.autodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MultiConstructorInjectedController {

    private final GreetingService greetingService;

    //@Value("${greeting.message}")
    private String message;

//    @Autowired
//    public MultiConstructorInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    public MultiConstructorInjectedController(GreetingService greetingService, String message) {
//        this.greetingService = greetingService;
//        this.message = message;
//    }

    // Preferibile avere un unico costruttore
    public MultiConstructorInjectedController(
            GreetingService greetingService,
            @Value("${greeting.message}") String message
    ) {
        this.greetingService = greetingService;
        this.message = message;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }

    public String sayGreetingWithMessage() {
        return this.message;
    }
}
