package com.ribasapi.market.modules.orders.repositories;

import com.ribasapi.market.modules.orders.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
