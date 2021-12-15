package com.ribasapi.market.modules.clients.controllers;

import com.ribasapi.market.modules.clients.entities.Client;
import com.ribasapi.market.modules.clients.services.FindAllClientsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
	@Autowired
	private FindAllClientsService findAllClientsService; 

	@GetMapping(value = "/")
	public ResponseEntity<Page<Client>> findAllClients(Pageable pageable) {
		Page<Client> clients = this.findAllClientsService.execute(pageable);
		return ResponseEntity.ok(clients);
	}
}
