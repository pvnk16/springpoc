package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.controller.SongController;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class SongApp {

	public static void main(String...args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SongAppConfig.class);
		
		SongController controller = context.getBean(SongController.class);
		System.out.println(controller.getSongDetails().getName());
		
	}

}