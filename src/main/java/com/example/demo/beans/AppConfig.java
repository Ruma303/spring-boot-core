package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import java.util.Scanner;

@Configuration("appConfig2") // Nome del bean di configurazione
@Scope("singleton") // Superflua
public class AppConfig {

    @Bean
    @Qualifier("scanner")
    public Scanner scanner() {
        System.out.println("Creazione del bean scanner");
        return new Scanner(System.in);
    }

    @Bean
    @Primary
    @Qualifier("primaryEmailService")
    @DependsOn({"scanner"}) // Il bean scanner deve essere creato prima di questo
    public EmailService primaryEmailService(
            Scanner scanner,
            @Qualifier("greetings") String greetings,
            @Qualifier("goodMorning") String goodMorning,
            @Qualifier("goodbye") String goodbye
    ) {
        System.out.println("Creazione del bean primaryEmailService");
        return new EmailService(scanner, greetings, goodMorning, goodbye);
    }

    // Il nome del bean sarà "alternativeEmailService", non "emailService"
    // Se si vuol assegnare un nome specifico al bean, usare @Bean("emailService")
    @Bean(name = "alternativeEmailService")
    @Qualifier("alternativeEmailService")
    @DependsOn({"scanner"}) // Il bean scanner deve essere creato prima di questo
    public EmailService alternativeEmailService(
            Scanner scanner,
            @Qualifier("greetings") String greetings,
            @Qualifier("goodMorning") String goodMorning,
            @Qualifier("goodbye") String goodbye
    ) {
        System.out.println("Creazione del bean alternativeEmailService");
        return new EmailService(scanner, greetings, goodMorning, goodbye);
    }

    @Bean
    @Qualifier("notificationService")
    public NotificationService notificationService(EmailService emailService) {
        System.out.println("Creazione del bean notificationService");
        return new NotificationService(emailService);
    }

}
