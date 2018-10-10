package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Component("demoMbean")
@ManagedResource(objectName = "Smartbox-Bean:name=BusinessClientShipmentStatsMbean")
public class DemoMbean{
    @Autowired
    ApplicationContext appContexts;
    @Autowired
    MyRefreshEventListener myRefreshEvent;
    @Autowired
    Environment env;
    @ManagedOperation
    public String sayHello() {
       RefreshEventSource refreshEventSource=  appContexts.getBean("refreshEventSource",RefreshEventSource.class);
       refreshEventSource.raiseRefresh();
        System.out.println(env.getProperty("name"));        
        System.out.println(env.getProperty("msg"));
        return "hello";
    }    
}
