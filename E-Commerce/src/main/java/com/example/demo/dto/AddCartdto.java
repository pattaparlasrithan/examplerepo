package com.example.demo.dto;


public class AddCartdto {
    private int orderid;
    private int productid;
    private String productcat;
    private String productname;
    private int quantity;
    private int productprice;
	public AddCartdto(int orderid, int productid, String productcat, String productname, int quantity,
			int productprice) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.productcat = productcat;
		this.productname = productname;
		this.quantity = quantity;
		this.productprice = productprice;
	}
	public int getOrderid() {
		return orderid;
	}
	public int getProductid() {
		return productid;
	}
	public String getProductcat() {
		return productcat;
	}
	public String getProductname() {
		return productname;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getProductprice() {
		return productprice;
	}
    
	
	
}
