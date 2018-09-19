/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.ItemService;
import com.spring.service.impl.ItemServiceImpl;

public class App {

    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	ItemService itemService = context.getBean(ItemServiceImpl.class,"factoryItemService");
    	
    	System.out.println(itemService.getItem().getName());
    	
    }
}