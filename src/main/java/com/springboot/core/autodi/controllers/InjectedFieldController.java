package com.springboot.core.autodi.controllers;

import com.springboot.core.autodi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InjectedFieldController {

    @Autowired
    public GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
