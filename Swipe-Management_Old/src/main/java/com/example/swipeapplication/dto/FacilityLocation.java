package com.example.swipeapplication.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.swipeapplication.entity.Facility;
import com.example.swipeapplication.entity.Location;

import lombok.Data;

@Data
public class FacilityLocation {
	
	private long locationid;
	private long facilityid;
	private String facilityname;
	private String locationname;
	private List<Location> location1;
	private List<Facility> facility1;
	public FacilityLocation() {
		
	}
	public FacilityLocation(List<Location> location,List<Facility> facility) {
		this.location1 = location;
		this.facility1 = facility;
		
	}
	
	
	public FacilityLocation(long locationid,String facilityname,String locationname) {
		this.locationid = locationid;
		this.facilityname = facilityname;
		this.locationname = locationname;
	}
	public long getLocationid() {
		return locationid;
	}
	public void setLocationid(long locationid) {
		this.locationid = locationid;
	}
	public String getFacilityname() {
		return facilityname;
	}
	public void setFacilityname(String facilityname) {
		this.facilityname = facilityname;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	public long getFacilityid() {
		return facilityid;
	}
	public List<Location> getLocation1() {
		return location1;
	}
	public List<Facility> getFacility1() {
		return facility1;
	}
	

}
