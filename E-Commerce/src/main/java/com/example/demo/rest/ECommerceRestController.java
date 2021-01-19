package com.example.demo.rest;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AddCartdto;
import com.example.demo.dto.LoginPrDetailsdto;
import com.example.demo.exceptions.CustomException;
import com.example.demo.service.ECommerceService;
import com.example.demo.serviceimpl.ECommerceserviceimpl;


@RestController
public class ECommerceRestController {
	@GetMapping("/login")
	public ResponseEntity<List<LoginPrDetailsdto>> productWithCategory(@RequestParam String uname,@RequestParam String password) throws CustomException{
		
		
		ECommerceService productdetails = new ECommerceserviceimpl(); 
		List<LoginPrDetailsdto> prdetails = productdetails.validateLogin(uname,password);
		
		return new ResponseEntity<List<LoginPrDetailsdto>>(prdetails,HttpStatus.OK);
	}
	@PostMapping("/addcart")
	public ResponseEntity<String> addToCarts(@RequestParam int orderid,@RequestParam int productid,@RequestParam String productcat,@RequestParam String productname,
			@RequestParam int quantity,@RequestParam int productprice) throws CustomException, ClassNotFoundException, SQLException{
		
		
		ECommerceService addcart = new ECommerceserviceimpl(); 
		List<AddCartdto> cartdetails = addcart.addToCart(orderid,productid,productcat,productname,quantity,productprice);
		String cartmsg = null;
		if(cartdetails != null) {
			cartmsg = "Successfully added Product(s) into the cart.";
			return new ResponseEntity<String>(cartmsg,HttpStatus.OK);
			
		}
		else {
		cartmsg = "Empty cart.";
		return new ResponseEntity<String>(cartmsg,HttpStatus.OK);
		}
	}
	@GetMapping("/purchaseprdt")
	public ResponseEntity<List<AddCartdto>> purchaseProduct(){
		
		
		ECommerceService addcart = new ECommerceserviceimpl(); 
		List<AddCartdto> cartdetails = addcart.purchaseProducts();
		
		return new ResponseEntity<List<AddCartdto>>(cartdetails,HttpStatus.OK);
	}

}
