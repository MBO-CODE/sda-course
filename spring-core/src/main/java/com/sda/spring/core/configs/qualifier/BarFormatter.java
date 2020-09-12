package com.sda.spring.core.configs.qualifier;

import org.springframework.stereotype.Component;

@Component

public class BarFormatter implements Formatter {

    @Override
    public String format(String someString) {
        System.out.println("bar formatter");
        return " bar formatting";
    }
}
