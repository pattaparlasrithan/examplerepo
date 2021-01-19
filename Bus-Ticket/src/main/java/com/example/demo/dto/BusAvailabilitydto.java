package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class BusAvailabilitydto {
	private int busavailid;	
	private int availableseat;	
	private int fare;
	public BusAvailabilitydto(int busavailid, int availableseat, int fare) {
		super();
		this.busavailid = busavailid;
		this.availableseat = availableseat;
		this.fare = fare;
	}
	public int getBusavailid() {
		return busavailid;
	}
	public int getAvailableseat() {
		return availableseat;
	}
	public int getFare() {
		return fare;
	}

}
