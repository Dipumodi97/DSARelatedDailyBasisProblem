package com.dipu.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipu.product.entity.Product;
import com.dipu.product.exception.ProductNotFoundException;
import com.dipu.product.service.ProductService;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id){
		
		
		Product product1 = service.getProductById(id);
		
		return ResponseEntity.ok(product1);
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> allProducts = service.getAllProducts();
		
		return ResponseEntity.ok(allProducts);
	}
	
	public ResponseEntity<String> toHandleProductNotFind(ProductNotFoundException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
}
