package com.ribasapi.market.modules.orders.controllers;

import com.ribasapi.market.modules.orders.entities.Order;
import com.ribasapi.market.modules.orders.services.FindAllOrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	@Autowired
	private FindAllOrdersService findAllOrdersService;

	@GetMapping(value = "/")
	public ResponseEntity<Page<Order>> findAllOrders(Pageable pageable) {
		Page<Order> orders = this.findAllOrdersService.execute(pageable);
		return ResponseEntity.ok(orders);
	}
}
