package com.example.demo.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class EnglishGreetingService implements  GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - IT";
    }
}
