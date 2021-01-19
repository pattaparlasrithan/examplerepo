package com.example.demo.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.http.ResponseEntity;

import com.example.demo.dto.BusAndAvailabilitydto;
import com.example.demo.exceptions.CustomException;
import com.example.demo.rest.BusBookingRestController;
import com.example.demo.service.BusBookingservice;
import com.example.demo.serviceimpl.BusBookingserviceimpl;


@TestInstance(Lifecycle.PER_CLASS)
public class BusBookingserviceimpltest {
	BusBookingservice service;
	BusBookingRestController controller;
	@BeforeAll
	public void setup() {
		service = new BusBookingserviceimpl();
		controller = new BusBookingRestController();
	}
	@Test
	@DisplayName("Get the list of availability")
	public void busAvailability() {
		String source = "Hyderabad";
		String destination = "Bangalore";
		String localdate = "2020-11-24";
		List lst = service.busAvailability(source,destination,localdate);
		assertEquals(lst, lst);
		
	}
	@Test
	@DisplayName("Get the list of busAvailabilities")
	public void busAvailabilities() throws ParseException {
		String source = "Hyderabad";
		String destination = "Bangalore";
		String localdate = "2020-11-24";
		ResponseEntity<List<BusAndAvailabilitydto>> lst = controller.busAvailabilities(source,destination,localdate);
		assertEquals(lst, lst);
		
	}

	
}
