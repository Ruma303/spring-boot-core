package com.example.demo;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class Interfaces implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, BeanPostProcessor, ApplicationContextAware, SmartInitializingSingleton,
        SmartLifecycle  {

    private String config;
    private boolean running;

    public void setConfig(String config, String running) {
        this.config = config;
        this.running = Boolean.parseBoolean(running);
    }

    @Override // È preferibile usare @PostConstruct
    public void afterPropertiesSet() {
        System.out.println("Inizializzazione completata: " + config);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Nome del bean: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("BeanFactory che ha creato il bean: " + beanFactory);
    }

    @Override // Accede al contesto dell'applicazione
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println("ApplicationContext che ha creato il bean: " + applicationContext);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("Prima dell'inizializzazione: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("Dopo l'inizializzazione: " + beanName);
        return bean;
    }

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("Tutti i singleton sono stati istanziati");
    }

    @Override // È preferibile usare @PreDestroy
    public void destroy() {
        System.out.println("Bean distrutto, chiusura risorse...");
    }


    @Override
    public void start() {
        System.out.println("Bean in avvio...");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println("Bean in arresto...");
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int getPhase() {
        return 0;
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }
}
