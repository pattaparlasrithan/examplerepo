package com.example.demo.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.demo.exceptions.CustomException;
import com.example.demo.service.ECommerceService;
import com.example.demo.serviceimpl.ECommerceserviceimpl;


@TestInstance(Lifecycle.PER_CLASS)
public class ECommerceserviceimpltest {
	
	ECommerceService service;
	  
	  @BeforeAll public void setup() { 
		  service = new ECommerceserviceimpl(); }
	  
	  @Test
	  
	  @DisplayName("validateLogin") 
	  public void validateLogin() { 
		  String uname = "raju";
		  String pwd = "123";
		  List lst
	  = service.validateLogin(uname,pwd);
		  assertEquals(lst, lst);
	  
	  }
	  
	  @Test
	  
	  @DisplayName("Add into the cart") 
	  public void addToCart() throws ClassNotFoundException, SQLException { 
		  int orderid = 1004;
		  int productid = 17;
		  String productcat = "grocery";
		  String productname = "ICE Cream";
		  int quantity = 2;
		  int productprice = 150;
		  List
	  lst = service.addToCart(orderid,productid,productcat,productname,quantity,productprice);
	  assertEquals(lst, lst);
	  
	  }
	  
	  @Test
	  
	  @DisplayName("Purchase product(s)") 
	  // @ParameterizedTest(name = "To get the policy id{0}") // @ValueSource(ints = {1,2,3,4}) 
	  public void purchaseProducts() throws CustomException 
	  { 
	  List lst =
	  service.purchaseProducts(); 
	  assertEquals(lst, lst);
	  
	  }
	 
}