package com.core.manualdi.controllers;

import com.springboot.core.manualdi.controllers.SetterInjectedController;
import com.springboot.core.manualdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}