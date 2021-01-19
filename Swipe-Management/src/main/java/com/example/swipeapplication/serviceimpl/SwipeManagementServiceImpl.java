package com.example.swipeapplication.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.swipeapplication.dto.FacilityLocation;
import com.example.swipeapplication.entity.Facility;
import com.example.swipeapplication.entity.Location;
import com.example.swipeapplication.repository.SwipeManagementRepository;
import com.example.swipeapplication.repository.SwipeManagementRepository2;
import com.example.swipeapplication.service.SwipeManagementService;

@Service
@Repository
public class SwipeManagementServiceImpl implements SwipeManagementService{
    @Autowired
    SwipeManagementRepository smRepository;
    SwipeManagementRepository2 smRepository2;
    Location location;
    Facility facility;
	@Override
	public List<Facility> getFacilities() {
		// TODO Auto-generated method stub
		List<Facility> facility = new ArrayList<Facility>(); 
//		FacilityLocation facility = new FacilityLocation();
		List<Location> loc = new ArrayList<Location>();
		List<FacilityLocation> fc = new ArrayList<FacilityLocation>();
//		smRepository.findAll();
		return smRepository.findAll();
	}
	public Facility saveOrUpdate(FacilityLocation facilities)   
	{  
		 
		Facility fac = smRepository.save(facilities.getFacility()); 
		return fac;
	}
	@Override
	public void delete(long facilityid) {
		// TODO Auto-generated method stub
		smRepository.deleteById(facilityid);
	}  
	

}
