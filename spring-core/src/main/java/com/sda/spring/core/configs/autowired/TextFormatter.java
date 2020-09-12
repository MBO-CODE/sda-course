package com.sda.spring.core.configs.autowired;

import org.springframework.stereotype.Component;

@Component
public class TextFormatter {

    public void formatText() {
        System.out.println("check format");
    }

}
