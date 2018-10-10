package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jmx.support.MBeanServerFactoryBean;


@SpringBootApplication
public class Demo1Application  implements CommandLineRunner {
    private boolean CONTINUE = true;
    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(Demo1Application.class);
        ApplicationContext context = (AnnotationConfigApplicationContext) application.run(args);                    
    }

    @Override
    public void run(String... args) throws Exception {
        while (CONTINUE) {
            // System.out.println("I am running");
            Thread.sleep(9000000);
        }
    }

    @Bean("mbeanExporter")
    public MBeanServerFactoryBean server() throws Exception {
        return new MBeanServerFactoryBean();
    }
}
