package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.spring.domain.App;

@Configuration
@Profile("prod")
@ComponentScan(basePackages="com.spring")
public class ProdConfig {
	
	

	@Bean
	public App getApp() {
		App app = new App();
		app.setName("App");
		app.setVesion("1.0.RELEASE");
		return app;
	}
	

}
