package com.springboot.core.lesson.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoodbyeMessages {

    @Bean(name = "goodbye")
    public String getGoodbye() {
        return "Goodbye!";
    }

    @Bean(name = "seeYouLater")
    public String getSeeYouLater() {
        return "See you later!";
    }
}
