package com.example.demo.configs;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("session")
public class PaymentService implements PaymentServiceImpl {

    private final AccountRepository accountRepository;

    @Autowired
    public PaymentService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostConstruct
    public void init() {
        System.out.println("PaymentService inizializzato");
    }

    public void processPayment() {
        System.out.println("Elaborazione pagamento...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PaymentService sta per essere distrutto");
    }
}
