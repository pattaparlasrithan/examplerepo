package com.example.swipeapplication.service;

import java.util.List;

import com.example.swipeapplication.dto.FacilityLocation;
import com.example.swipeapplication.entity.Facility;

public interface SwipeManagementService {
	public List<Facility> getFacilities();
	public Facility saveOrUpdate(Facility facilities);
	public void delete(long facilityid); 
	

}
