package com.example.demo.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final Environment environment;

    @Autowired
    public MyService(Environment environment) {
        this.environment = environment;
    }

    public String getJavaVersion() {
        return environment.getProperty("java.version"); // proprietà JVM
    }

    public String getOsName() {
        return environment.getProperty("os.name"); // variabile di sistema
    }

    public String getAppName() {
        return environment.getProperty("spring.application.name"); // da application.properties
    }

    public String getCustomProperty() {
        return environment.getProperty("my.custom.property"); // custom user-defined
    }

    public int getPort() {
        return Integer.parseInt(environment.getProperty("server.port", "8080")); // conversione manuale con default
    }

    public boolean isFeatureEnabled() {
        return Boolean.parseBoolean(environment.getProperty("feature.enabled", "false"));
    }
}
