package com.ribasapi.market.modules.clients.repositories;

import com.ribasapi.market.modules.clients.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
