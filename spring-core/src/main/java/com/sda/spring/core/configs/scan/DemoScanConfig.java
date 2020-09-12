package com.sda.spring.core.configs.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoScanConfig {

    public static void main(String[] args) {


        //create context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanConfig.class);
        //get  component
        MyComponent myComponent = applicationContext.getBean("myComponent", MyComponent.class);
        //use component
        myComponent.complexOperation();
    }
}
