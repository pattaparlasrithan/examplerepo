package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Order;

public interface Orderdao extends JpaRepository<Order, Integer>{

	public Order findByOname(String oname);

}
