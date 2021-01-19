package com.example.demo.dao.util.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity(name = "bus")
public class Bus {
	@Id
	@Column(name = "busid")
	private int busid;
	@Column(name = "busname")
	private String busname;
	@Column(name = "bussource")
	private String bussource;
	@Column(name = "busdestination")
	private String busdestination;
	@Column(name = "buslocaldate")
	private String buslocaldate;
	@Column(name = "Busavailid")
	@OneToMany(mappedBy = "Bus.class",cascade = CascadeType.ALL)
	private List<BusAvailabilityEntity> Busavailid;
	public Bus(int busid, String busname, String bussource, String busdestination, String buslocaldate,
			List<BusAvailabilityEntity> busavailid) {
		super();
		this.busid = busid;
		this.busname = busname;
		this.bussource = bussource;
		this.busdestination = busdestination;
		this.buslocaldate = buslocaldate;
		Busavailid = busavailid;
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
	public List<BusAvailabilityEntity> getBusavailid() {
		return Busavailid;
	}
	
	

}
