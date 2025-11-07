package com.springboot.core.manualdi.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from GreetingServiceImpl";
    }
}