package com.example.demo.dto;

import java.util.Date;
import java.text.DateFormat;


public class BusAndAvailabilitydto {
    private int busid;	
	private String busname;	
	private String bussource;	
	private String busdestination;	
	private String buslocaldate;
	private int busavailid;	
	private int availableseat;	
	private int fare;
	private String msg;
	public BusAndAvailabilitydto() {
		
	}
	public BusAndAvailabilitydto(int busid, String busname, String bussource, String busdestination, String buslocaldate,
			int busavailid, int availableseat, int fare) {
		super();
		this.busid = busid;
		this.busname = busname;
		this.bussource = bussource;
		this.busdestination = busdestination;
		this.buslocaldate = buslocaldate;
		this.busavailid = busavailid;
		this.availableseat = availableseat;
		this.fare = fare;
	}
	public BusAndAvailabilitydto(int busid, String busname, String bussource, String busdestination, String buslocaldate,
			int busavailid, int availableseat, int fare,String msg) {
		super();
		this.busid = busid;
		this.busname = busname;
		this.bussource = bussource;
		this.busdestination = busdestination;
		this.buslocaldate = buslocaldate;
		this.busavailid = busavailid;
		this.availableseat = availableseat;
		this.fare = fare;
		this.msg = msg;
	}
	public int getBusid() {
		return busid;
	}
	public String getBusname() {
		return busname;
	}
	public String getBussource() {
		return bussource;
	}
	public String getBusdestination() {
		return busdestination;
	}
	public String getBuslocaldate() {
		return buslocaldate;
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
	public String getMSG() {
		return msg;
	}

}
