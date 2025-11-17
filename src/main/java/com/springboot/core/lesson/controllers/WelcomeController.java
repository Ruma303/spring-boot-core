package com.springboot.core.lesson.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

    private final String appName;

    public WelcomeController(String appName) {
        this.appName = appName;
    }

    public String printAppName() {
        return appName;
    }
}
