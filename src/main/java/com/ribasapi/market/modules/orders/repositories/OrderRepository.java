package com.ribasapi.market.modules.orders.repositories;

import com.ribasapi.market.modules.orders.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
