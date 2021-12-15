package com.ribasapi.market.modules.orders.controllers;

import com.ribasapi.market.modules.orders.entities.OrderItem;
import com.ribasapi.market.modules.orders.services.FindAllOrderItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order-item")
public class OrderItemController {
	@Autowired
	private FindAllOrderItemsService findAllOrderItemsService;

	@GetMapping(value = "/")
	public ResponseEntity<Page<OrderItem>> findAllOrderItems(Pageable pageable) {
		Page<OrderItem> orderItems = this.findAllOrderItemsService.execute(pageable);
		return ResponseEntity.ok(orderItems);
	}

}
