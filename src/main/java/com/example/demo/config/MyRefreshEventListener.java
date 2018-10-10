package com.example.demo.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyRefreshEventListener implements ApplicationListener<ContextRefreshedEvent>{    
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("refreshing ");
	}

}
