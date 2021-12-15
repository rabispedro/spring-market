package com.ribasapi.market.modules.products.services;

import com.ribasapi.market.modules.products.entities.Product;
import com.ribasapi.market.modules.products.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FindAllProductsService {
	@Autowired
	private ProductRepository productRepository;

	public Page<Product> execute(Pageable pageable) {
		Page<Product> products = this.productRepository.findAll(pageable);
		return products;
	}
}
