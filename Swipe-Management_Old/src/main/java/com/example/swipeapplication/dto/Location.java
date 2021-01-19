package com.example.swipeapplication.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
public class Location {
	
	private long locationid;
	private String locationname;	
	public Location() {
		
	}
	public long getLocationid() {
		return locationid;
	}
	public void setLocationid(long locationid) {
		this.locationid = locationid;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	
}
