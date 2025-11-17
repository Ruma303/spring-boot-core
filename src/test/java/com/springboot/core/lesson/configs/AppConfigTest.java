package com.springboot.core.lesson.configs;

import com.springboot.core.lesson.controllers.WelcomeController;
import com.springboot.core.lesson.services.GreetingServiceImpl;
import com.springboot.core.lesson.services.WelcomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppConfigTest {

    @Autowired
    AppConfig appConfig;

    @Autowired
    private WelcomeService welcomeService;

    @Autowired
    private GreetingServiceImpl greetingService;

    @Autowired
    private WelcomeController welcomeController;

    @Test
    void whichGreeting() {
        System.out.println(welcomeService.welcome());
    }

    @Test
    void greetingService() {
        assertEquals("Hello from GreetingServiceImpl", greetingService.sayGreeting());
    }

    @Test
    void welcomeController() {
        System.out.println(welcomeController.printAppName());
    }

    @Test
    void testWelcomeService() {
        String result = welcomeService.welcome();
        assertEquals("Hello from GreetingServiceImpl - Welcome to spring-boot-core", result);
    }
}