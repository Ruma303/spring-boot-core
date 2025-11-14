package com.springboot.core.configs;

import com.springboot.core.autodi.controllers.WelcomeController;
import com.springboot.core.autodi.services.GreetingServiceImpl;
import com.springboot.core.autodi.services.WelcomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppConfigTest {

    @Autowired
    AppConfig appConfig;

    @Autowired
    private String appName;

    @Autowired
    private Boolean dbConnection;

    @Autowired
    private WelcomeService welcomeService;

    @Autowired
    private GreetingServiceImpl greetingService;

    @Autowired
    private WelcomeController welcomeController;

    @Test
    void myBean() {
        System.out.println(appConfig.myBean());
    }

    @Test
    void appName() {
        assertEquals("spring-boot-core", appName);
    }

    @Test
    void dbConnection() {
        assertTrue(dbConnection);
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