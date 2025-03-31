package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

//    @Bean("myBean")
//    public MyClass myClass() {
//        return new MyClass();
//    }
    
    @Bean
    public MyClass myFirstBean() {
        return new MyClass();
    }
}
