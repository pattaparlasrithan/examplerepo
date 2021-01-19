package com.example.demo.dto;

import java.util.Date;

public class Busdto {
	private int busid;
	
	private String busname;
	
	private String bussource;
	
	private String busdestination;
	
	private Date buslocaldate;
	
	public Busdto(int busid, String busname, String bussource, String busdestination, Date buslocaldate) {
		super();
		this.busid = busid;
		this.busname = busname;
		this.bussource = bussource;
		this.busdestination = busdestination;
		this.buslocaldate = buslocaldate;

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
	public Date getBuslocaldate() {
		return buslocaldate;
	}
	
	
	

}
