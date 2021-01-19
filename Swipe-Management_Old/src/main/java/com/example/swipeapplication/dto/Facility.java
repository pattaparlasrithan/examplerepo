package com.example.swipeapplication.dto;



import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
public class Facility {
	
	private long facilityid;
	private String facilityname;	
	public Facility() {
		
	}
	public Facility(long facilityid,String facilityname) {
		this.facilityid = facilityid;
		this.facilityname = facilityname;
	}
	public long getFacilityid() {
		return facilityid;
	}
	public void setFacilityid(long facilityid) {
		this.facilityid = facilityid;
	}
	public String getFacilityname() {
		return facilityname;
	}
	public void setFacilityname(String facilityname) {
		this.facilityname = facilityname;
	}
	
	

}
