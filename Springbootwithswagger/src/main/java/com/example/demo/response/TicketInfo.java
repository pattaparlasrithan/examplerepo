package com.example.demo.response;

import lombok.Data;

@Data
public class TicketInfo {
    private String name;
    private String from;
    private String to;
    private String flightId;
    private String dateofJourney;
    private String ticketStatus;
    private String ticketPrice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
}
