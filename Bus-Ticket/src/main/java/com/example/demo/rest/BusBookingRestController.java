package com.example.demo.rest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.BusAndAvailabilitydto;

import com.example.demo.exceptions.CustomException;
import com.example.demo.service.BusBookingservice;

import com.example.demo.serviceimpl.BusBookingserviceimpl;


@RestController
public class BusBookingRestController {
	
	@Autowired
	BusBookingservice busavailability;
	
	@PostMapping("/bussearch")
	public ResponseEntity<List<BusAndAvailabilitydto>> busAvailabilities(@RequestParam String source,@RequestParam String destination,
			@RequestParam String localdate1) throws ParseException {
		List<BusAndAvailabilitydto> busdetails = busavailability.busAvailability(source, destination, localdate1);
		return new ResponseEntity<List<BusAndAvailabilitydto>>(busdetails,HttpStatus.OK);
		
	}

}
