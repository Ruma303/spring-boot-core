package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration("appConfig2") // Nome del bean di configurazione
@Scope("singleton")
public class AppConfig {

    @Bean
    @Qualifier("accountRepository")
    public AccountRepository accountRepository() {
        return new AccountRepository();
    }

    @Bean
    @Qualifier("paymentService")
    public PaymentService paymentService(AccountRepository accountRepository) {
        return new PaymentService(accountRepository);
    }
}
