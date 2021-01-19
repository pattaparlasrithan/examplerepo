package com.example.demo.dto;

public class LoginPrDetailsdto {
	private String loginmsg;
    private String productname;
    private String productcat;
	public LoginPrDetailsdto(String loginmsg, String productname, String productcat) {
		super();
		this.loginmsg = loginmsg;
		this.productname = productname;
		this.productcat = productcat;
	}
	public String getLoginmsg() {
		return loginmsg;
	}
	public String getProductname() {
		return productname;
	}
	public String getProductcat() {
		return productcat;
	}

}
