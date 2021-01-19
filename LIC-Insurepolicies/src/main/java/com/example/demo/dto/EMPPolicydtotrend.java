package com.example.demo.dto;

import java.util.Date;

import lombok.Data;
@Data
public class EMPPolicydtotrend {
	private int emppolicyid;
	private int empid;
	private int policyid;
	private Date datelastadded;
	private String trend;
	public EMPPolicydtotrend(String trend) {
		
		this.trend = trend;
	}
	public EMPPolicydtotrend(int emppolicyid, int empid, int policyid, Date datelastadded, String trend) {
		super();
		this.emppolicyid = emppolicyid;
		this.empid = empid;
		this.policyid = policyid;
		this.datelastadded = datelastadded;
		this.trend = trend;
	}
	public int getEmppolicyid() {
		return emppolicyid;
	}
	public int getEmpid() {
		return empid;
	}
	public int getPolicyid() {
		return policyid;
	}
	public Date getDatelastadded() {
		return datelastadded;
	}
	public String getTrend() {
		return trend;
	}

}
