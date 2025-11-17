package com.springboot.core.lesson.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    // Constructor Injection

    private final GreetingService greetingService;
    private final String appName;

    @Autowired
    public WelcomeService(
            @Qualifier("greetingServiceImpl") GreetingService greetingService,
            @Value("${spring.application.name}") String appName
    ) {
        this.greetingService = greetingService;
        this.appName = appName;
    }


    // Setter Injection
    /*
    private GreetingService greetingService;
    private String appName;

    public WelcomeService() {
        // Costruttore vuoto richiesto per la setter injection
    }

    @Autowired
    @Qualifier("greetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Autowired // opzionale, Spring può gestire anche property injection su setter senza annotazione
    public void setAppName(@Value("${spring.application.name}") String appName) {
        this.appName = appName;
    }
    */

    // Field Injection
    /*
    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingService;

    @Value("${spring.application.name}")
    private String appName;

    public WelcomeService() {
        // Il costruttore può essere vuoto o contenere altre logiche
    }*/

    public String welcome() {
        return greetingService.sayGreeting() + " - Welcome to " + appName;
    }

}