package com.dipu.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dipu.product.entity.Order;
import com.dipu.product.entity.Product;
import com.dipu.product.exception.ProdServiceException;
import com.dipu.product.repo.OrderRepository;
import com.dipu.product.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private RestTemplate temp;
	@Override
	public Order createOrder(Order order) {
		for(Integer prodId :order.getProducts()) {
			try {
				temp.getForObject("http://productService/products/"+prodId, Product.class);
			}//try
			catch(Exception e) {
				throw new ProdServiceException("Failed Data as We fetch"+prodId);
			}
			
		}
		return repo.save(order);
	}

}
