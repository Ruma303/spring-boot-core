package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

//    @Bean("myBean")
//    public MyClass myClass() {
//        return new MyClass();
//    }
    
    @Bean(name = "bean1")
    public MyClass myFirstBean() {
        return new MyClass();
    }
    
    //@Primary
    @Bean(name = "bean2")
    public MyClass mySecondBean() {
        return new MyClass();
    }
}
