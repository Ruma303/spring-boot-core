package com.example.demo.beans;

import org.springframework.context.annotation.Lazy;

import java.util.Scanner;

@Lazy
public class EmailService {

    private final Message message;
    private final Scanner scanner;
    private String emailMessage;

    public EmailService(Message message, Scanner scanner) {
        this.message = message;
        this.scanner = scanner;
    }

    public void createEmail() {
        System.out.print("Inserisci il nome dell'utente: ");
        String userName = scanner.nextLine();
        emailMessage = message.getGoodMorning() + ", " + userName + "! " + message.getGreetings();
    }

    public String getGreetings() {
        return message.getGreetings();
    }

    public String getEmailMessage() {
        return emailMessage;
    }
}