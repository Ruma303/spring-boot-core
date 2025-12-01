package com.springboot.core.profiles;

import com.springboot.core.services.GreetingService;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"IT", "default"})
@Service("i18nService")
// @Primary
public class ItalianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Ciao Mondo! - IT";
    }
}
