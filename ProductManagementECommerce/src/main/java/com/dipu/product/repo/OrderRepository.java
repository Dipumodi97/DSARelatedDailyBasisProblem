package com.dipu.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipu.product.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
