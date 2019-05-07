package com.cf.demos.myDemo;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/5/6.
 */
public class ExampleService {
    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
