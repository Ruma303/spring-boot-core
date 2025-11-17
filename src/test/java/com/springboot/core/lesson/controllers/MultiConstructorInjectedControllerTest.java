package com.springboot.core.lesson.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultiConstructorInjectedControllerTest {

    @Autowired
    MultiConstructorInjectedController controller;

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }

    @Test
    void sayGreetingWithMessage() {
        System.out.println(controller.sayGreetingWithMessage());
    }
}