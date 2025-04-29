package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

import java.util.Scanner;

@Lazy
public class EmailService {

    @Autowired
    @Qualifier("greetings")
    private String greetings;

    @Autowired
    @Qualifier("goodMorning")
    private String goodMorning;

    @Autowired
    @Qualifier("goodbye")
    private String goodbye;

    @Autowired
    private Scanner scanner;

    private String emailMessage;


    // Constructor injection
    @Autowired
    public EmailService(
            Scanner scanner,
            @Qualifier("greetings") String greetings,
            @Qualifier("goodMorning") String goodMorning,
            @Qualifier("goodbye") String goodbye
    ) {
        this.scanner = scanner;
        this.greetings = greetings;
        this.goodMorning = goodMorning;
        this.goodbye = goodbye;
    }

    public void createEmail() {
        System.out.print("Inserisci il nome dell'utente: ");
        String userName = scanner.nextLine();
        emailMessage =
                greetings + ", " // Uso dei bean nominati
                + userName + "! "
                + "\n" + goodMorning
                + "\n" + goodbye;
    }

    public String getEmailMessage() {
        return emailMessage;
    }

    public String getGreetings() {
        return greetings;
    }
}