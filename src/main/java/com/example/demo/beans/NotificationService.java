package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

@Lazy
// @Service // Già annotato in AppConfig
public class NotificationService {

    // Non è possibile usare @Autowired su un campo final
    private final EmailService emailService;

    private EmailService alternativeEmailService;

    @Autowired
    @Qualifier("goodbye")
    private String goodbye;

    @Autowired
    @Qualifier("greetings")
    private String greetings;


    // Injection del bean primario senza specificare il nome e usando constructor injection
    public NotificationService(EmailService emailService) {
        this.emailService = emailService; // Usa il bean primario
    }

    @Autowired // Specifica che questo sarà il costruttore principale
    public NotificationService(
            EmailService emailService,
            @Qualifier("alternativeEmailService") EmailService alternativeEmailService,
            Message message
    ) {
        this.emailService = emailService;
        this.alternativeEmailService = alternativeEmailService;
    }

    // Injection del bean alternativo specificandolo con @Qualifier e usando set injection
    @Autowired
    public void setNotification(
            @Qualifier("alternativeEmailService") EmailService emailService
    ) {
        this.alternativeEmailService = emailService;
    }

    // Alternativa senza usare il setter: Iniezione diretta del bean alternativo
//    @Autowired
//    @Qualifier("emailService")
//    private EmailService alternativeEmailService;


    public void sendNotification() {
        System.out.println("Invio email con primario: " + emailService.getEmailMessage());
    }

    public void sendAlternativeNotification() {
        System.out.println("Invio email con alternativo: " + alternativeEmailService.getGreetings());
        System.out.println("Messaggio di chiusura: " + goodbye);
    }
}