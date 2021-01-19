package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	 public static Connection initializeDatabase() 
		        throws SQLException, ClassNotFoundException 
		    { 
		        // Initialize all the information regarding 
		        // Database Connection 
		        //String dbDriver = "com.mysql.jdbc.Driver"; 
		        String dbDriver = "com.mysql.cj.jdbc.Driver";
//		        String dbURL = "jdbc:mysql://localhost:3306/customerbank", "root", "root"; 
		        // Database name to access 
		/*
		 * String dbName = "project"; String dbUsername = "root"; String dbPassword =
		 * "root";
		
		  
		        Class.forName(dbDriver); 
		        Connection con = DriverManager.getConnection(dbURL + dbName, 
		                                                     dbUsername,  
		                                                     dbPassword);  */
		        Class.forName(dbDriver); 
		        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root"); 
		        return con; 
		    } 

}

