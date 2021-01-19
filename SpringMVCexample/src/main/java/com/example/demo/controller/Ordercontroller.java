package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Orderservice;

@RestController
public class Ordercontroller {
	@Autowired
	private Orderservice orderservice;
	@GetMapping("/getPrice/{oname}")
	public String getOrderPrice(@PathVariable String oname) {
		double oamount = orderservice.getPrice(oname);
		return "Amount for product"+oname+"is"+oamount;
		
	}

}
