package com.springboot.core.manualdi.controllers;

import com.springboot.core.manualdi.services.GreetingService;
import com.springboot.core.manualdi.services.GreetingServiceImpl;

public class InjectedFieldController {
    private final GreetingService greetingService;

    public InjectedFieldController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}