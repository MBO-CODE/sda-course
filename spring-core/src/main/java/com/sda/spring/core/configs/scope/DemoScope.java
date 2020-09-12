package com.sda.spring.core.configs.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoScope {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);

        createPrototypeService(applicationContext);
        createSingletonService(applicationContext);

    }

    private static void createSingletonService(ApplicationContext applicationContext) {
        SingletonService service1 = applicationContext.getBean("singletonService", SingletonService.class);
        SingletonService service2 = applicationContext.getBean("singletonService", SingletonService.class);
        System.out.println(service1);
        System.out.println(service2);

    }

    private static void createPrototypeService(ApplicationContext applicationContext) {
        PrototypeService service1 = applicationContext.getBean("prototypeService", PrototypeService.class);
        PrototypeService service2 = applicationContext.getBean("prototypeService", PrototypeService.class);
        System.out.println(service1);
        System.out.println(service2);

    }
}
