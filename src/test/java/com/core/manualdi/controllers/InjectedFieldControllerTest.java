package com.core.manualdi.controllers;

import com.springboot.core.manualdi.controllers.InjectedFieldController;
import org.junit.jupiter.api.Test;

class InjectedFieldControllerTest {

    @Test
    void sayGreeting() {
        InjectedFieldController controller = new InjectedFieldController();
        System.out.println(controller.sayGreeting());
    }
}