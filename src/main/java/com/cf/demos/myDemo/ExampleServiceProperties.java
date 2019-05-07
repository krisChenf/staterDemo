package com.cf.demos.myDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2019/5/6.
 */
@ConfigurationProperties(prefix = "example.service")
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
