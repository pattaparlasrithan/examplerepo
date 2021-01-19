package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.Passengerinfo;
import com.example.demo.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	@PostMapping(
			 value = "/bookflightticket",
			 consumes = {
					 "application/JSON",
					 "application/XML"
			 },
			 produces = {
					 "application/JSON",
					 "application/XML"
			 }
			)
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody Passengerinfo pinfo){
		TicketInfo ticket = new TicketInfo();
		ticket.setName(pinfo.getFname()+" "+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setFlightId(pinfo.getFlightId());
		ticket.setDateofJourney(pinfo.getDateofJourney());
		ticket.setTicketPrice("4000.00 INR");
		ticket.setTicketStatus("Confirmed");
		return new ResponseEntity<TicketInfo>(ticket,HttpStatus.OK);
		
	}
	

}
