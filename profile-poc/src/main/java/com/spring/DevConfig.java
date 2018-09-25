package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.domain.App;

@Configuration
@Profile("dev")
@ComponentScan(basePackages = "com.spring")
public class DevConfig {

	@Bean
	public App getApp() {
		App app = new App();
		app.setName("Dev App");
		app.setVesion("1.0.SNAPSHOT");
		return app;
	}

}
