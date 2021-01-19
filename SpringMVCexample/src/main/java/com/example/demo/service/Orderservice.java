package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Orderdao;
import com.example.demo.model.Order;

@Service
public class Orderservice {
	@Autowired
	private Orderdao orderdao;
	@PostConstruct
	public void addOrder2DB() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(102,"Mobile","Electronic",10000.00));
		orders.add(new Order(100,"Laptop","Electronic",50000.00));
//		orderdao.save(orders);
	}
	public double getPrice(String oname) {
		Order order = orderdao.findByOname(oname);
		return order.getOamount();
	}

}
