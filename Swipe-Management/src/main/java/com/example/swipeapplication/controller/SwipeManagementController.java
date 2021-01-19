package com.example.swipeapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.swipeapplication.dto.FacilityLocation;
import com.example.swipeapplication.entity.Facility;
import com.example.swipeapplication.service.SwipeManagementService;


@RestController
public class SwipeManagementController {
	@Autowired
	SwipeManagementService smService;
	@GetMapping("/facilitydetails")
	public ResponseEntity<List<Facility>> getFacility() {
		List<Facility> facilities = new ArrayList<Facility>();
		try {
		facilities = smService.getFacilities();
		return new ResponseEntity<List<Facility>>(facilities,HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Facility>>(facilities,HttpStatus.OK);
		}
	}
	@PostMapping("/facilities")  
	private ResponseEntity<String> saveFacility(@RequestBody FacilityLocation facility)   
	{  
		String msg = null;
		Facility fac = smService.saveOrUpdate(facility);  
		if(fac != null) {
			msg = "Successfully added/updated record...";
		}
		else {
			msg = "No record added/updated...";
		}
	return new ResponseEntity<String>(msg,HttpStatus.OK);  
	} 
	@DeleteMapping("/book/{facilityid}")  
	private String deleteFacility(@PathVariable("facilityid") int facilityid)   
	{ 
		String msg = null;
		try { 
		smService.delete(facilityid);  
		msg = "Record is successfully deleted.";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg = "Issue while deleting the Record.";
		}
		return msg;
	}  

}
