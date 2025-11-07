package com.springboot.core.manualdi.services;

public interface GreetingService {
    default String sayGreeting() {
        return "Hello from GreetingService";
    };
}