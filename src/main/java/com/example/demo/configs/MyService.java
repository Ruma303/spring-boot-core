package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.*;

@Service
public class MyService {

	// @Autowired // Field Injection
	// @Qualifier("bean2") // Qualifier per specificare quale bean iniettare
	private MyClass myClass;

	private Environment environment;

	public String fieldInjection() {
		return "Field Injection: " + myClass.sayHello();
	}

	// Method Injection
	@Autowired
	public void methodInjection(@Qualifier("bean1") MyClass myClass) {
		this.myClass = myClass;
	}

	@Autowired // Setter Injection
	public void setInjection(@Qualifier("bean2") MyClass myClass) {
		this.myClass = myClass;
	}

	// Setter Injection per Environment
	@Autowired
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public String getJavaVersion() {
		return environment.getProperty("java.version");
	}
	
	public String getOsName() {
		return environment.getProperty("os.name");
	}
	
	public String getAppName() {
		return environment.getProperty("spring.application.name");
	}
	
	public String getCustomProperty() {
		return environment.getProperty("my.custom.property");
	}
}
