package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final MyClass myClass;

    @Autowired // Dependency Injection tramite costruttore
    public MyComponent(@Qualifier("bean2") MyClass myClass) { // Specifica il bean da iniettare
        this.myClass = myClass;
    }

    public String sayHelloFromMyComponent() {
        return myClass.sayHello();
    }
}
