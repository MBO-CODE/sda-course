package com.sda.spring.core.configs.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoQualifier {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(QualifierConfig.class);

        FooService fooService = applicationContext.getBean("fooService", FooService.class); //check this one,somethings wrong

        fooService.run();

    }
}
