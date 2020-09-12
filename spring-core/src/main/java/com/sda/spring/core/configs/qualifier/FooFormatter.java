package com.sda.spring.core.configs.qualifier;

import org.springframework.stereotype.Component;

@Component

public class FooFormatter implements Formatter {

    public String format(String someString) {
        System.out.println("foo formatter");
        return "foo formatting";
    }
}
