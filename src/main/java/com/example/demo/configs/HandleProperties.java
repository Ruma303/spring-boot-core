package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
	@PropertySource("classpath:custom.properties"),	
	@PropertySource("classpath:custom2.properties")	
})
public class HandleProperties {

	private final MyClass myClass;
	
	@Value("${app.version}")
	private String appVersion; 
	
	@Value("${custom.prop.2}")
	private String customProp2;
	
	public String getCustomProp2() {
		return customProp2;
	}

	public void setCustomProp2(String customProp2) {
		this.customProp2 = customProp2;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public MyClass getMyClass() {
		return myClass;
	}

	public HandleProperties(@Qualifier("bean2") MyClass myClass) {
		this.myClass = myClass;
	}
}
