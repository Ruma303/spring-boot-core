package com.springboot.core.autodi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InjectedFieldControllerTest {

    @Autowired
    InjectedFieldController controller;

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}