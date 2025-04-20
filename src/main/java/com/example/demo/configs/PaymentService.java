package com.example.demo.configs;

public class PaymentService  {

    private final AccountRepository accountRepository;

    public PaymentService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        System.out.println("Account recuperato: " + accountRepository.getAccount());
    }
}
