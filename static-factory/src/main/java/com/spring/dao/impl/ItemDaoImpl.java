package com.spring.dao.impl;

import com.spring.dao.ItemDao;
import com.spring.domain.Item;

public class ItemDaoImpl implements ItemDao {

	@Override
	public Item getItem() {
		Item i = new Item();

		i.setId("1");
		i.setName("item1");
		i.setPrice("12.00");
		
		return i;
	}

}
