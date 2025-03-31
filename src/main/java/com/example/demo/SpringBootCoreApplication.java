package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import com.example.demo.configs.ApplicationConfig;
import com.example.demo.configs.MyClass;
import com.example.demo.configs.MyComponent;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootCoreApplication {
	
	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootCoreApplication.class, args);

        // Ottenere il Bean MyClass dal contesto
		// MyClass myClass = ctx.getBean(MyClass.class);
		// System.out.println(myClass.sayHello());

        // Ottenere il Bean MyComponent dal contesto
        MyComponent myComponent = ctx.getBean("myFirstBean", MyComponent.class);
        System.out.println(myComponent.sayHelloFromMyComponent());
    }

//	public static void main(String[] args) {
//		var ctx = SpringApplication.run(SpringBootCoreApplication.class, args);
//		
//		// Piuttosto che creare un'istanza 
//		// MyClass myClass = new MyClass();
//		
//		// Iniettiamo il bean di MyClass indicato dal @Component
//		// MyClass myClass = ctx.getBean(MyClass.class);
//		// System.out.println(myClass.sayHello());
//	}
	
//	@Bean
//	public MyClass myClass2() {
//		return new MyClass();
//	}

}


//@Component
//class MyClass {
//    public String sayHello() {
//        return "Hello";
//    }
//}


