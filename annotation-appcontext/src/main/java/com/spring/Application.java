package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.controller.BookController;

public class Application {

	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BookConfiguration.class);

		BookController controller = context.getBean(BookController.class);

		System.out.println(controller.getBook().getAuthor());
	}

}
