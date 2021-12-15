package com.ribasapi.market.modules.products.repositories;

import com.ribasapi.market.modules.products.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
