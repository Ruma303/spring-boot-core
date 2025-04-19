package com.example.demo;

import com.example.demo.beans.EmailService;
import com.example.demo.beans.NotificationService;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCoreApplication {

    public static void main(String[] args) {

        // 1. Creazione contesto ApplicationContext.
        ApplicationContext context = SpringApplication.run(SpringBootCoreApplication.class, args);

        // 2.a Creazione email.
        // Chiamata a context.getBean() senza specificare il nome del bean alternativo
        // Questo recupera il bean marcato con @Primary.
        EmailService emailService = context.getBean(EmailService.class);
        emailService.createEmail();

        // 2.b Chiamata a context.getBean() specificando il nome del bean alternativo
        // Questo recupera il bean alternativo creato in AppConfig con @Bean(name = "alternativeEmailService").
        EmailService alternativeEmailService = context.getBean("alternativeEmailService",
                EmailService.class);


        // 3.a Invio notifica con bean primario.
        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.sendNotification();

        // 3.b Invio notifica con bean alternativo
        NotificationService alternativeNotificationService = context.getBean("notificationService",
                NotificationService.class);
        alternativeNotificationService.sendAlternativeNotification();

        // 5. Chiusura del bean CloseableBean
        context.getBean(CloseableBean.class).close();
    }

    public static class CloseableBean implements AutoCloseable {

        public CloseableBean() {
            System.out.println("Chiusura dal bean CloseableBean");
        }

        @Override
        public void close() {
            System.out.println("Esecuzione del metodo close()");
        }
    }

    @Bean(destroyMethod = "close")
    public CloseableBean closeableBean() {
        return new CloseableBean();
    }

}