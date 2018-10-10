package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value="file:/home/kishan/configuration/mbeanconfiguration/application.properties")
public class JavaConfig {
    @Autowired
    private Environment environment;
    public void display() {
        System.out.println(environment.getProperty("name"));
    }    
}
