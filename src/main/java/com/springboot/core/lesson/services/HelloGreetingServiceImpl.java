package com.springboot.core.lesson.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class HelloGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from HelloGreetingServiceImpl";
    }
}