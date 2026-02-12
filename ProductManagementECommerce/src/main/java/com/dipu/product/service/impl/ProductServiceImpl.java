package com.dipu.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipu.product.entity.Product;
import com.dipu.product.exception.ProductNotFoundException;
import com.dipu.product.repo.ProductRepository;
import com.dipu.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		
		return repo.findById(id).orElseThrow(()-> new ProductNotFoundException(""+id));
	}

}
