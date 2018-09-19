package com.spring.service.impl;

import com.spring.dao.ItemDao;
import com.spring.domain.Item;
import com.spring.service.ItemService;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	
	
	/*private constructor*/
	private ItemServiceImpl() {}

	public static ItemService getItemServiceImpl() {
		return new ItemServiceImpl();
	}
	
	@Override
	public Item getItem() {
		
		return this.itemDao.getItem();
	}

	/**
	 * @return the itemDao
	 */
	public ItemDao getItemDao() {
		return itemDao;
	}

	/**
	 * @param itemDao the itemDao to set
	 */
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

}
