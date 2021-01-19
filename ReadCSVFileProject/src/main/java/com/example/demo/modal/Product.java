package com.example.demo.modal;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private Integer productID;
	private String productname;
	private Double productprice;
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Double getProductprice() {
		return productprice;
	}
	public void setProductprice(Double productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productname=" + productname + ", productprice=" + productprice
				+ "]";
	}
	
	
}
