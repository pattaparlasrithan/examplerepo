package com.example.demo.dao.util.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity(name = "busavailability")
public class BusAvailabilityEntity {
	@Id
	@Column(name = "busavailid")
	private int busavailid;
	@Column(name = "availableseat")
	private int availableseat;
	@Column(name = "fare")
	private int fare;
	public BusAvailabilityEntity(int busavailid, int availableseat, int fare) {
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
