package com.springboot.core.manualdi.controllers;

import org.junit.jupiter.api.Test;

class GreetingControllerTest {

    @Test
    void sayGreeting() {
        GreetingController controller = new GreetingController();
        System.out.println(controller.sayGreeting());
    }
}