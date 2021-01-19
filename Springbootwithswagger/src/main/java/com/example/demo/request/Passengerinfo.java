package com.example.demo.request;

import lombok.Data;

@Data
public class Passengerinfo {
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String dateofJourney;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getDateofJourney() {
		return dateofJourney;
	}
	public void setDateofJourney(String dateofJourney) {
		this.dateofJourney = dateofJourney;
	}

}
