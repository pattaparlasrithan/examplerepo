package com.example.swipeapplication.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.swipeapplication.entity.Facility;
import com.example.swipeapplication.entity.Location;

import lombok.Data;

@Data
public class FacilityLocation {
	
	private Facility facility;
	public FacilityLocation() {
		
	}
	public FacilityLocation(Facility facility) {
		
		this.facility = facility;
		
	}	
	
	public Facility getFacility() {
		return facility;
	}
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	

}
