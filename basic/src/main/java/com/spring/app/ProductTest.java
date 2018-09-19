package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.ProductService;

public class ProductTest {

	public static void main(String... args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		ProductService service = context.getBean("test", ProductService.class);
		System.out.println(service.getProduct().getName());
		
	}

}
