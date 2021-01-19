package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.modal.Product;
@Component
public class Readfile implements IReadfile {

	@Override
	public List<Product> filterProduct(List<Product> lprice) {
		// TODO Auto-generated method stub
		List price = lprice.stream().filter(p -> p.getProductprice() < 3000).collect(Collectors.toList());
//		System.out.println(price);
		return price;
	}

}
