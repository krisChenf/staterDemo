package com.cf.demos.myDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/5/6.
 */
//@Configuration用于定义配置类，可替换xml配置文件，
// 被注解的类内部包含有一个或多个被@Bean注解的方法，
// 这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext
// 类进行扫描，并用于构建bean定义，初始化Spring容器。
@Configuration
@ComponentScan(
        basePackages = {"com.cf.*"}
)
// @ConditionalOnClass，当classpath下发现该类的情况下进行自动配置。
@ConditionalOnClass(ExampleService.class)
// 为带有@ConfigurationProperties注解的Bean提供有效的支持。
// 这个注解可以提供一种方便的方式来将带有
// @ConfigurationProperties注解的类注入为Spring容器的Bean。
@EnableConfigurationProperties(ExampleServiceProperties.class)
public class ExampleAutoConfigure {
    @Autowired
    private ExampleServiceProperties properties;
    // @Bean的条件注入 也是一种bean的注入方式
    @Bean
    // @ConditionalOnMissingBean，当Spring Context中不存在该Bean时。
    @ConditionalOnMissingBean
    // @ConditionalOnProperty(prefix = "example.service",value = "enabled",havingValue = "true")，
    // 当配置文件中example.service.enabled=true时。
    @ConditionalOnProperty(prefix = "example.service",value = "enabled",havingValue = "true")
    ExampleService exampleService (){
        return  new ExampleService(properties.getPrefix(),properties.getSuffix());
    }

}
