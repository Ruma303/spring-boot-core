package com.springboot.core.lesson.configs;

import com.springboot.core.lesson.services.GreetingService;
import com.springboot.core.lesson.services.WelcomeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String myBean() {
        return "Hello from myBean";
    }

//    @Value("${spring.application.name}")
//    private String greeting;

    // Recupero info esterne
    @Bean
    public String appName(@Value("${spring.application.name}") String greeting) {
        return greeting;
    }

    // Definizioni di configurazioni custom (es connessione centralizzata)
    @Bean
    public Boolean dbConnection() {
        return Boolean.TRUE;
    }

    // Richiamo di altri bean
//    @Bean
//    public GreetingServiceImpl greetingService() {
//        return new GreetingServiceImpl();
//    }

    @Bean
    public WelcomeService welcomeService(GreetingService greetingService, String appName) {
        return new WelcomeService(greetingService, appName);
    }
}
