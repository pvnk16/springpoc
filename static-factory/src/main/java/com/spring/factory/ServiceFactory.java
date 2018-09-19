package com.spring.factory;

import com.spring.service.ItemService;
import com.spring.service.impl.ItemServiceImpl;

public class ServiceFactory {
	
	
	public  ItemService getItemService() {
		return ItemServiceImpl.getItemServiceImpl();
	}

}
