package com.spring.serviceimpl;

import com.spring.dao.ProductDao;
import com.spring.domain.Product;
import com.spring.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	public ProductServiceImpl()  {
		System.out.println("ProductServiceImpl :: new");

	}
	
	private ProductDao productDao;
	

	/**
	 * @return the productDao
	 */
	public ProductDao getProductDao() {
		return productDao;
	}


	/**
	 * @param productDao the productDao to set
	 */
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}


	/*
	 * Method for getting product information.(non-Javadoc)
	 * @see com.spring.service.ProductService#getProduct()
	 */
	@Override
	public Product getProduct() {
		return this.productDao.getProductInfo();
	}

}
