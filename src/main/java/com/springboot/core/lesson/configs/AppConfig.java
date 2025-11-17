package com.springboot.core.lesson.configs;

import com.springboot.core.lesson.services.GreetingService;
import com.springboot.core.lesson.services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String appName(@Value("${spring.application.name}") String greeting) {
        return greeting;
    }

    // @Bean
    public WelcomeService welcomeService(
        // Uso forzato del bean greetingServiceImpl
        // @Qualifier("greetingServiceImpl")
        GreetingService greetingService, String appName
    ) {
        // return new WelcomeService();
        return new WelcomeService(greetingService, appName);
    }
}
