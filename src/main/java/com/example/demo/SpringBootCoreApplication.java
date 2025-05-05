package com.example.demo;

import com.example.demo.env.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootCoreApplication {

    public static void main(String[] args) {

        // 1. Creazione contesto ApplicationContext.
        ApplicationContext context = SpringApplication.run(SpringBootCoreApplication.class, args);

        // 2. Recupero del bean MyService dal contesto.
        MyService myService = context.getBean(MyService.class);

        // 3. Utilizzo del servizio per ottenere le proprietà.
        String javaVersion = myService.getJavaVersion();
        String osName = myService.getOsName();
        String appName = myService.getAppName();
        String customProperty = myService.getCustomProperty();
        int port = myService.getPort();
        List<String> properties = Arrays.asList(javaVersion, osName, appName, customProperty, String.valueOf(port));

        // 4. Stampa delle proprietà recuperate.
        System.out.println("Environment Properties:");
        for (String property : properties) {
            System.out.println(property);
        }

        // 5. Stampa delle proprietà personalizzate.
        System.out.println("\nCustom Properties:");
        List<String> appConfigProperties = Arrays.asList(
                "app.config.name",
                "app.config.description",
                "app.config.maxUsers"
        );

        for (String property : appConfigProperties) {
            System.out.println(property + ": " + context.getEnvironment().getProperty(property));
        }
    }
}