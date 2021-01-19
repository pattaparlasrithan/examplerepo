package com.example.demo.dto;

import java.util.Date;

import lombok.Data;
@Data
public class EMPPolicydto {
	private int emppolicyid;
	private int empid;
	private int policyid;
	private Date datelastadded;
	public EMPPolicydto(int emppolicyid, int empid, int policyid, Date datelastadded) {
		super();
		this.emppolicyid = emppolicyid;
		this.empid = empid;
		this.policyid = policyid;
		this.datelastadded = datelastadded;
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

}
