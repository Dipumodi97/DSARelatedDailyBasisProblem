package com.dipu.product.service;

import java.util.List;

import com.dipu.product.entity.Product;

public interface ProductService {

	//public List<Product> getAllProducts();
	
	public Product getProductById(Integer id);

	public List<Product> getAllProducts();

	//public Product getProductById(Integer id);
}
