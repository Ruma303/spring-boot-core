package com.example.demo.env;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// Carica tutte le proprietà che iniziano con "app.config" da application.properties
@ConfigurationProperties(prefix = "app.config")
public class AppConfigProperties {

    // Creiamo le proprietà con i valori con prefisso app.config
    private String name;
    private String description;
    private int maxUsers;

    // Getter e Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }
}