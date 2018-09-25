package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.App;
import com.spring.service.AppService;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	private App app;

	@Override
	public App getAppDetails() {
		return this.app;
	}

}
