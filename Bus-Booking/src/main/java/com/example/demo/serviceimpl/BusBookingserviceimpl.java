package com.example.demo.serviceimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.example.demo.dao.DatabaseConnection;
import java.text.DateFormat;
import com.example.demo.dto.BusAndAvailabilitydto;
import com.example.demo.exceptions.CustomException;
import com.example.demo.service.BusBookingservice;


public class BusBookingserviceimpl implements BusBookingservice{
	@Override
	public List<BusAndAvailabilitydto> busAvailability(String source,String destination,
			DateFormat localdate) {
		// TODO Auto-generated method stub
		List<BusAndAvailabilitydto> al = new ArrayList<BusAndAvailabilitydto>();
		try {
			
			String sql = "SELECT busid,Busavailid,busname FROM world.bus where bussource='"+source+"' and busdestination='"+destination+"' and buslocaldate='"+localdate+"'";	
			
	         	Connection conn;			
					conn = DatabaseConnection.initializeDatabase();			
				Statement statement = conn.createStatement();
		        ResultSet resultSet = statement.executeQuery(sql);
	            
	            while (resultSet.next()) {
	            	int busid = resultSet.getInt("busid");
	            	int Busavailid = resultSet.getInt("Busavailid");
	            	String busname = resultSet.getString("busname");
	            	int Availableseat = 0;
	            	int fare = 0;
	            	if(Busavailid != 0) {
	            		String sql1 = "SELECT Availableseat,fare FROM world.busavailability where Busavailid="+Busavailid;
	            		Statement statement1 = conn.createStatement();
	            		ResultSet resultSet1 = statement1.executeQuery(sql1);
	            		while (resultSet1.next()) {
	            			Availableseat = resultSet1.getInt("Availableseat");
	            			fare = resultSet1.getInt("fare");
	            			
	            		}
	            	}
	            	al.add(new BusAndAvailabilitydto(busid,busname,source,destination,localdate,
	            			Busavailid,Availableseat,fare));
	            }
	            return al;
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return al;
			
		}
		
	}
	

}
