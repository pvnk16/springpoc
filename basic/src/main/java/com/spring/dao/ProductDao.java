package com.spring.dao;

import com.spring.domain.Product;

public interface ProductDao {
	
	/**
	 * Get product information.
	 * @return {@link Product} reference.
	 */
	public Product getProductInfo();
	
}
