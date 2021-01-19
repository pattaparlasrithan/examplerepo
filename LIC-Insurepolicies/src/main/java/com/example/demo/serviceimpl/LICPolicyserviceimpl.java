package com.example.demo.serviceimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.example.demo.dao.DatabaseConnection;
import com.example.demo.dto.EMPPolicydto;
import com.example.demo.dto.EMPPolicydtotrend;
import com.example.demo.dto.LICPolicydto;
import com.example.demo.exceptions.CustomException;
import com.example.demo.service.LICPolicyservice;


public class LICPolicyserviceimpl implements LICPolicyservice{

	@Override
	public List<LICPolicydto> getDataList() {
		try {
		
		String sql = "select * from `lic_policy`";		
         	Connection conn;			
				conn = DatabaseConnection.initializeDatabase();			
			Statement statement = conn.createStatement();
	        ResultSet resultSet = statement.executeQuery(sql);
            List<LICPolicydto> al = new ArrayList<LICPolicydto>();
            while (resultSet.next()) {
			  int PolicyId = resultSet.getInt("policyId"); 
			  String PolicyName = resultSet.getString("PolicyName");                                  
			  String MinEntryAge = resultSet.getString("minEntryAge");			  
			  String MaximumMaturityAge = resultSet.getString("maximumMaturityAge");
			  String MinPolicyTerm = resultSet.getString("minPolicyTerm");
			  String MinimumPremium = resultSet.getString("MinimumPremium");
			  String MinSumAssured = resultSet.getString("MinSumAssured");
			  String PoilicyDesc = resultSet.getString("poilicyDesc");
			  String MaxEntryAge = resultSet.getString("maxEntryAge");
			  String MaxPolicyTerm = resultSet.getString("maxPolicyTerm");
			  al.add(new LICPolicydto(PolicyId, PolicyName, MinEntryAge, MaximumMaturityAge, MinPolicyTerm, MinimumPremium, 
					  MinSumAssured, PoilicyDesc, MaxEntryAge, MaxPolicyTerm));
		} 
            return al;
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<EMPPolicydto> getEMPDataList() {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			String sql = "select * from `employee_policy`";
	         	Connection conn;			
					conn = DatabaseConnection.initializeDatabase();			
				Statement statement = conn.createStatement();
		        ResultSet resultSet = statement.executeQuery(sql);
	            List<EMPPolicydto> al = new ArrayList<EMPPolicydto>();
	            while (resultSet.next()) {
				  int EmpPolicyId = resultSet.getInt("empPolicyId"); 
				  int EmpId = resultSet.getInt("empId");
				  int PolicyId = resultSet.getInt("policyId");
				  Date DateLastAdded = resultSet.getDate("dateLastAdded");
				  al.add(new EMPPolicydto(EmpPolicyId, EmpId, PolicyId, DateLastAdded));
			} 
	            return al;
			}catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	}

	@Override
	public List getTrendCount(int policyid) throws CustomException{
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			String trend = null;
			int pcount1 = 0;
			int pcount2 = 0;
			int pcount3 = 0;
			int pcount4 = 0;
			String sql = "select * from `employee_policy`";
			String sql1 = "select * from employee_policy where dateLastAdded >= DATE_SUB(CURDATE(), INTERVAL 4 DAY) and policyId='"+policyid+"'";
			// Initialize the database 
			    Connection conn;			
					conn = DatabaseConnection.initializeDatabase();			
				Statement statement = conn.createStatement();
		        ResultSet resultSet = statement.executeQuery(sql);
	            List<EMPPolicydto> al = new ArrayList<EMPPolicydto>();
	            while (resultSet.next()) {
				  int PolicyId = resultSet.getInt("policyId");
				  if(PolicyId == 1) {
					  pcount1++;
				  }else if(PolicyId == 2) {
					  pcount2++;
				  }else if(PolicyId == 3) {
					  pcount3++;
				  }else if(PolicyId == 4){
					  pcount4++;
				  }else {
					  throw new CustomException("Currently Policyid is not available in DB...");
				  }
				
			} 
	            if( pcount1 >= pcount2 && pcount1 >= pcount3 && pcount1 >= pcount4) {
	            	trend = pcount1 + " is the largest count so that trend of the Policy is 'LIC JeevanAkshay'.";
	                System.out.println(pcount1 + " is the largest count so that trend of the Policy is 'LIC JeevanAkshay'.");
	            }
	            else if (pcount2 >= pcount1 && pcount2 >= pcount3 && pcount2 >= pcount4 ) {
	            	trend = pcount2 + " is the largest count so that trend of the Policy is 'LIC e-term Insurance'."; 
	                System.out.println(pcount2 + " is the largest count so that trend of the Policy is 'LIC e-term Insurance'.");
	            }
	            else if (pcount3 >= pcount1 && pcount3 >= pcount2 && pcount3 >= pcount4 ) {
	            	trend = pcount2 + " is the largest count so that trend of the Policy is 'LIC JeevanAnand'.";
	                System.out.println(pcount2 + " is the largest count so that trend of the Policy is 'LIC JeevanAnand'.");
	            }
	            else {
	            	trend = pcount4 + " is the largest count so that trend of the Policy is 'LIC Jeevan Saral'.";
	                System.out.println(pcount4 + " is the largest count so that trend of the Policy is 'LIC Jeevan Saral'.");
	            }
	            Statement pstatement = conn.createStatement();
		        ResultSet presultSet = pstatement.executeQuery(sql1);
		        List<EMPPolicydtotrend> empp = new ArrayList<EMPPolicydtotrend>();
	            while (presultSet.next()) {
	            	
	  
	              
				  int EmpPolicyId = presultSet.getInt("empPolicyId"); 
				  int EmpId = presultSet.getInt("empId");
				  int PolicyId = presultSet.getInt("policyId");
				  java.sql.Date DateLastAdded = presultSet.getDate("dateLastAdded");
				  empp.add(new EMPPolicydtotrend(EmpPolicyId, EmpId, PolicyId, DateLastAdded, trend));
	            }
	            for(EMPPolicydtotrend lempp : empp) {
	            	System.out.println(lempp.getEmppolicyid()+" "+lempp.getEmpid()+" "+lempp.getPolicyid()+" "+lempp.getDatelastadded());
	            }
	           
	            if(0 == policyid || policyid > 4) {
	            //	throw new CustomException("Currently Policyid is not available in DB...");
	            	trend = "Currently Policyid is not available in DB...";
	            	empp.add(new EMPPolicydtotrend(trend));
	            	
	            }
	            
	           
	       return empp;
			}catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		
	}

}
