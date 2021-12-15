package com.ribasapi.market.modules.orders.services;

import com.ribasapi.market.modules.orders.entities.Order;
import com.ribasapi.market.modules.orders.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service	
public class FindAllOrdersService {
	@Autowired
	private OrderRepository orderRepository;

	public Page<Order> execute(Pageable pageable) {
		Page<Order> orders = this.orderRepository.findAll(pageable);
		return orders;
	}
}
