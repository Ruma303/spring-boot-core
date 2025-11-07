package com.springboot.core.autodi.services;

public interface GreetingService {
    default String sayGreeting() {
        return "Hello from GreetingService";
    }
}
