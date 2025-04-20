package com.example.demo.configs;

import org.springframework.context.annotation.*;

@Configuration // 1. Definire classe di configurazione
public class AppConfig {

    @Bean // 2. Creazione di un primo bean
    public AccountRepository accountRepository() {
        System.out.println("Creazione del bean accountRepository");
        return new AccountRepository();
    }

    @Bean // 3. Creazione secondo bean che necessita del primo
    // Il primo bean viene iniettato come parametro (Dependency Injection)
    public PaymentService paymentService(AccountRepository accountRepository) {
        System.out.println("Creazione del bean paymentService");
        return new PaymentService(accountRepository);
    }
}
