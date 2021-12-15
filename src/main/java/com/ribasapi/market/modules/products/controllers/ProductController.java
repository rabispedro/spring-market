package com.ribasapi.market.modules.products.controllers;

import com.ribasapi.market.modules.products.entities.Product;
import com.ribasapi.market.modules.products.services.FindAllProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	@Autowired
	private FindAllProductsService findAllProductsService;

	@GetMapping(value = "/")
	public ResponseEntity<Page<Product>> findAllProducts(Pageable pageable) {
		Page<Product> products = this.findAllProductsService.execute(pageable);
		return ResponseEntity.ok(products);
	}
	
}
