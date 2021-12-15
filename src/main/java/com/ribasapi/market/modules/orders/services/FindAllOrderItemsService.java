package com.ribasapi.market.modules.orders.services;

import com.ribasapi.market.modules.orders.entities.OrderItem;
import com.ribasapi.market.modules.orders.repositories.OrderItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FindAllOrderItemsService {
	@Autowired
	private OrderItemRepository orderItemRepository;

	public Page<OrderItem> execute(Pageable pageable) {
		Page<OrderItem> orderItems = this.orderItemRepository.findAll(pageable);
		return orderItems;
	}
}
