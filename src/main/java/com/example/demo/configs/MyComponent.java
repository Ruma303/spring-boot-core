package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final MyClass myClass;

    @Autowired // Dependency Injection tramite costruttore
    public MyComponent(MyClass myClass) {
        this.myClass = myClass;
    }

    public String sayHelloFromMyComponent() {
        return myClass.sayHello();
    }
}
