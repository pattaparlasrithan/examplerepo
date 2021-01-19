package com.bank.webactioncontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bank.dao.DatabaseConnection;
import com.bank.dto.Translist;
import com.bank.service.Transactionservice;
import com.bank.serviceimpl.Transserviceimpl;

public class BankHistoryDetails extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
		// TODO Auto-generated method stub
		res.setContentType("text/html");//setting the content type  
		PrintWriter out=res.getWriter();//get the stream to write the data  
//		String sql = "SELECT trans_id,account_number,amount,date,trans_type FROM TRANSACTION HISTORY";
		//String sql = "SELECT * FROM TRANSACTION HISTORY";
		//String sql = "select * from `transaction history`";
		// Initialize the database 
		//    System.out.println("We are here.....");
			/*
			 * Connection conn = DatabaseConnection.initializeDatabase(); Statement
			 * statement = conn.createStatement();
			 */
		      //  Transaction connfortrans = new Connfortrans();
			/*
			 * Transactionservice connfortrans = new Transserviceimpl(); ResultSet resultSet
			 * = connfortrans.getConnection();
			 */
	            
			/*
			 * out.println("<!DOCTYPE html>"); out.println("<html>"); out.println("<head>");
			 * out.println("<title>Transaction details are:</title>");
			 * out.println("</head>");
			 * out.println("<body><table border=\"1\" align=\\\"center\\\">");
			 * out.println("<h1>Transaction details are:</h1>"); out.println("<tr>");
			 * out.println("<th>Trans_ID</th>"); out.println("<th>Account_No</th>");
			 * out.println("<th>Amount</th>"); out.println("<th>Date</th>");
			 * out.println("<th>Trans_Type</th>"); out.println("</tr>");
			 */
	            /*ArrayList<Translist> al = new ArrayList<Translist>();
	            while (resultSet.next()) {
	            	
	              out.println("<tr>");
	              
				  long transid = resultSet.getLong("trans_id"); 
				  long accountno = resultSet.getLong("account_number");                                  
				  long amount = resultSet.getLong("amount"); 
				  //Timestamp tdate = resultSet.getTimestamp("date");
				  Date tdate = resultSet.getDate("date");
				  //long type = resultSet.getLong("trans_type"); 
				  String type = resultSet.getString("trans_type");
				  
				  
//				  ArrayList<Translist> al = new ArrayList<Translist>();
				  al.add(new Translist(transid, accountno, amount, tdate, type));
				
				 * al.add(accountno); al.add(amount); al.add(tdate); al.add(type);
				 
				  ArrayList list = new ArrayList();
				  list.add(al);
				  req.setAttribute("data", al);
				  
				  
				  System.out.println("Transaction details are:");
				  System.out.println("Trans_ID: "+transid+"Account_Number: "
				  +accountno+"Amount: "+amount+ "Date: "+tdate+"Trans_Type: "+type);*/
				/*
				 * out.println("<td>");
				 * out.println("Trans_ID: "+transid+"Account_Number: "+accountno+"Amount: "
				 * +amount+ "Date: "+tdate+"Trans_Type: "+type); out.println("</td><br>");
				 */
				 
				/*
				 * out.print(+resultSet.getLong("trans_id") +
				 * "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp" + resultSet.getLong("account_number")+
				 * "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp" + resultSet.getLong("amount")+
				 * "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp" + resultSet.getTimestamp("date") +
				 * "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp" + resultSet.getLong("trans_type") +
				 * "<br>");
				 */
				/*
				 * out.println("<td>"+transid+"</td>"); out.println("<td>"+accountno+"</td>");
				 * out.println("<td>"+amount+"</td>"); out.println("<td>"+tdate+"</td>");
				 * out.println("<td>"+type+"</td>");
				 * 
				 * out.println("</tr>");
				 */
//	            }
			/*
			 * out.println("</table></body>"); out.println("</html>");
			 */
				Transactionservice connfortrans = new Transserviceimpl();
				List<Translist> list = connfortrans.getDataList();
				req.setAttribute("data", list);
	            RequestDispatcher rd =  
			             req.getRequestDispatcher("view/translist.jsp");
			  rd.forward(req, res);
		} catch(Exception e){
     		e.printStackTrace();
	}
}
	/*
	 * public List<Translist> getDataList(){ Transactionservice connfortrans = new
	 * Transserviceimpl(); List<Translist> list = connfortrans.getConnection();
	 * 
	 * }
	 */

}
