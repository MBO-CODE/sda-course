package com.sda.spring.core.configs.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoAutowired {

    public static void main(String[] args) {
        /*
        Fara spring

        SpellChecker spellChecker = new SpellChecker();
        TextEditor textEditor = new TextEditor(spellChecker);
         */

        /*
        Folosind spring
         */

        // create context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredConfig.class);
        // get component
        TextEditor textEditor = applicationContext.getBean("textEditor", TextEditor.class);
        // use component
        textEditor.convertImage();
        textEditor.formatT();
        textEditor.spellCheck();

    }
}
