package com.example.demo.configs;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope("request")
public class AccountRepository implements AccountRepositoryImpl {
    private String accountId;

    public AccountRepository() {
        this.accountId = "defaultAccountId";
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
