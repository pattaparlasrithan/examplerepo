package com.example.demo.service;


import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.AddCartdto;
import com.example.demo.dto.LoginPrDetailsdto;
import com.example.demo.exceptions.CustomException;




public interface ECommerceService {
	
	
	public List<LoginPrDetailsdto> validateLogin(String uname,String pwd);
	public List<AddCartdto> addToCart(int orderid,int productid,String productcat,String productname,
			int quantity,int productprice) throws ClassNotFoundException, SQLException;
	public List<AddCartdto> purchaseProducts();

}
