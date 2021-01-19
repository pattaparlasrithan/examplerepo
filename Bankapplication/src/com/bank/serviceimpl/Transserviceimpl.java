package com.bank.serviceimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.dao.DatabaseConnection;
import com.bank.dto.Translist;
import com.bank.service.Transactionservice;

public class Transserviceimpl implements Transactionservice{

	@Override
	public List<Translist> getDataList() {
		try {
		// TODO Auto-generated method stub
		String sql = "select * from `transaction history`";
		// Initialize the database 
		//    System.out.println("We are here.....");
         	Connection conn;			
				conn = DatabaseConnection.initializeDatabase();			
			Statement statement = conn.createStatement();
	        ResultSet resultSet = statement.executeQuery(sql);
	        Transactionservice connfortrans = new Transserviceimpl();
 //           ResultSet resultSet = connfortrans.getConnection();
            List<Translist> al = new ArrayList<Translist>();
            while (resultSet.next()) {
            	
  //            out.println("<tr>");
              
			  long transid = resultSet.getLong("trans_id"); 
			  long accountno = resultSet.getLong("account_number");                                  
			  long amount = resultSet.getLong("amount"); 
			  //Timestamp tdate = resultSet.getTimestamp("date");
			  Date tdate = resultSet.getDate("date");
			  //long type = resultSet.getLong("trans_type"); 
			  String type = resultSet.getString("trans_type");
			  
			  
//			  ArrayList<Translist> al = new ArrayList<Translist>();
			  al.add(new Translist(transid, accountno, amount, tdate, type));
			/*
			 * al.add(accountno); al.add(amount); al.add(tdate); al.add(type);
			 */
			  ArrayList list = new ArrayList();
			  list.add(al);
			  
			  
			  
			  System.out.println("Transaction details are:");
			  System.out.println("Trans_ID: "+transid+"Account_Number: "
			  +accountno+"Amount: "+amount+ "Date: "+tdate+"Trans_Type: "+type);
	            
//	            return resultSet;
			    
		} 
            return al;
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
