package com.example.demo.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.example.demo.dao.DatabaseConnection;
import com.example.demo.dto.AddCartdto;
import com.example.demo.dto.LoginPrDetailsdto;
import com.example.demo.exceptions.CustomException;
import com.example.demo.service.ECommerceService;



public class ECommerceserviceimpl implements ECommerceService{

	
	@Override
	public List<LoginPrDetailsdto> validateLogin(String uname,String pwd) {
		String str = null;
		String pname = null;
		String pcat = null;
		List<LoginPrDetailsdto> al = new ArrayList<LoginPrDetailsdto>();
		try {
		// TODO Auto-generated method stub
			
		String sql = "SELECT username,userpwd FROM world.user";
		String sql1 = "SELECT productname,productcategory FROM world.product;";
		Connection conn;			
		conn = DatabaseConnection.initializeDatabase();	
		Connection conn1;			
		conn1 = DatabaseConnection.initializeDatabase();	
	Statement statement = conn.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);    
    if (resultSet.next()) {
    	if((resultSet.getString("username").equals(uname)) && (resultSet.getString("userpwd").equals(pwd))) {
    		str = "Login Succeeded";
					/*
					 * Statement pstatement = conn1.createStatement(); ResultSet presultSet =
					 * pstatement.executeQuery(sql1);
					 */
    		resultSet = statement.executeQuery(sql1);
    	    while(resultSet.next()) {
    	    	pname = resultSet.getString("productname");
    	    	pcat = resultSet.getString("productcategory");
    	    	al.add(new LoginPrDetailsdto(str,pname,pcat));
    	    }
    	    
    	}
    	else {
    		str = "Login Failed...";
    		al.add(new LoginPrDetailsdto(str,pname,pcat));
    	}
    	
    	
	}
        return al;
		}catch(SQLException se) {
			se.printStackTrace();
			return al;
		}
		catch(Exception e) {
			e.printStackTrace();
			return al;
		}
	}

	@Override
	public List<AddCartdto> addToCart(int orderid,int productid,String productcat,String productname,
			int quantity,int productprice) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<AddCartdto> al = new ArrayList<AddCartdto>();				
		Connection conn;			
		conn = DatabaseConnection.initializeDatabase();	    
		if(orderid != 0 && productid != 0 && productcat != null && productname != null && quantity != 0 && productprice != 0) {
		String sql = "insert into ordercart values("+orderid+","+productid+",'"+productcat+"','"+productname+"',"+quantity+","+productprice+")";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();		
		al.add(new AddCartdto(orderid,productid,productcat,productname,quantity,productprice));
		
		
		}
		return al;
	}

	@Override
	public List<AddCartdto> purchaseProducts() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM world.ordercart";
		List<AddCartdto> al = new ArrayList<AddCartdto>();
		try {
		Connection conn;			
		conn = DatabaseConnection.initializeDatabase();	
		Connection conn1;			
		conn1 = DatabaseConnection.initializeDatabase();	
	Statement statement = conn.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);    
    while (resultSet.next()) {
    	int ordercid = resultSet.getInt("ordercid");
    	int orderpid = resultSet.getInt("orderpid");
    	String orderpcategory = resultSet.getString("orderpcategory");
    	String orderpname = resultSet.getString("orderpname");
    	int orderquantity = resultSet.getInt("orderquantity");
    	int orderprice = resultSet.getInt("orderprice");
    	al.add(new AddCartdto(ordercid,orderpid,orderpcategory,orderpname,orderquantity,orderprice));
		
	}
    return al;
	}catch(SQLException se) {
		se.printStackTrace();
		return al;
	}
	catch(Exception e) {
		e.printStackTrace();
		return al;
	}
	}

}
