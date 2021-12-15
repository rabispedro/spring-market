package com.ribasapi.market.modules.clients.services;

import com.ribasapi.market.modules.clients.entities.Client;
import com.ribasapi.market.modules.clients.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FindAllClientsService {
	@Autowired
	private ClientRepository clientRepository;
	
	public Page<Client> execute(Pageable pageable) {
		Page<Client> clients = this.clientRepository.findAll(pageable);
		return clients;
	}
}
