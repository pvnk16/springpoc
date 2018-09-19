package com.spring.daoimpl;

import com.spring.dao.ProductDao;
import com.spring.domain.Product;

public class ProductDaoImpl implements ProductDao {
	
	public ProductDaoImpl() {
		System.out.println("ProductDaoImpl :: new");
	}

	/*
	 * Get product information.(non-Javadoc)
	 * @see com.spring.dao.ProductDao#getProductInfo()
	 */
	@Override
	public Product getProductInfo() {
		Product product = new Product();
		
		/*Set dummy product information*/
		product.setId("p1");
		product.setName("iris");
		product.setInStock(true);
		product.setPrice(10000.00);
		
		return product;
	}

}
