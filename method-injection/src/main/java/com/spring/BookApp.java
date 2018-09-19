/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.controller.BookController;

public class BookApp {

	public static void main(String... args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		BookController controller = context.getBean(BookController.class,"bookController");
		
		System.out.println(controller.getBookInfo().getTitle());
	}
}
