package com.example.demo.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"IT", "default"})
@Service("i18nService")
public class ItalianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Ciao Mondo! - IT";
    }
}
