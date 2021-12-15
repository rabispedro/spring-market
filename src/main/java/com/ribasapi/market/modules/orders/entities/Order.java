package com.ribasapi.market.modules.orders.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ribasapi.market.modules.clients.entities.Client;
import com.ribasapi.market.modules.orders.utils.OrderStatus;


import lombok.Data;

@Entity
@Table(name = "tb_orders")
@Data
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "moment", nullable = false)
	private Instant moment;

	@Column(name = "status", nullable = false)
	private OrderStatus orderStatus;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@OneToMany(mappedBy = "order")
	@Column(name = "items", nullable = true)
	private List<OrderItem> items = new ArrayList<OrderItem>();

	public double getTotal() {
		double sum = 0.00;
		for (OrderItem item : items) {
			sum += item.getSubTotal();
		}
		return sum;
	}
}
