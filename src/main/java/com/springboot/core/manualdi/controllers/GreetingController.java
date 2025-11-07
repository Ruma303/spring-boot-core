package com.springboot.core.manualdi.controllers;

import com.springboot.core.manualdi.services.GreetingService;
import com.springboot.core.manualdi.services.GreetingServiceImpl;

public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}