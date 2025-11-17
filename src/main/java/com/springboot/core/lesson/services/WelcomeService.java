package com.springboot.core.lesson.services;

public class WelcomeService {
    private final GreetingService greetingService;
    private final String appName;

    public WelcomeService(GreetingService greetingService, String appName) {
        this.greetingService = greetingService;
        this.appName = appName;
    }

    public String welcome() {
        return greetingService.sayGreeting() + " - Welcome to " + appName;
    }
}