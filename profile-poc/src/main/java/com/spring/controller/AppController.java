package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.domain.App;
import com.spring.service.AppService;

@Component
public class AppController {

	@Autowired
	private AppService appService;

	
	public App getAppDetails() {
		
		return this.appService.getAppDetails();
	}

}
