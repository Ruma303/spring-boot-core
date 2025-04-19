package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

@Lazy
// @Service // Già annotato in AppConfig
public class NotificationService {
    // Non è possibile usare @Autowired su un campo final
    private final EmailService emailService;

    @Autowired // Non necessario, già iniettato tramite il setter (field injection)
    private EmailService alternativeEmailService;

    @Autowired
    private Message message;

    // Injection del bean primario senza specificare il nome e usando constructor injection
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public NotificationService(
            EmailService emailService,
            @Qualifier("alternativeEmailService") EmailService alternativeEmailService,
            Message message
    ) {
        this.emailService = emailService;
        this.alternativeEmailService = alternativeEmailService;
        this.message = message;
    }

    // Injection del bean alternativo specificandolo con @Qualifier e usando set injection
    @Autowired
    public void setNotification(@Qualifier("alternativeEmailService") EmailService emailService) {
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
        System.out.println("Invio email con alternativo: " + message.getGoodbye());
    }
}