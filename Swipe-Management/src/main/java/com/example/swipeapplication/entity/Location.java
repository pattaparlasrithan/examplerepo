package com.example.swipeapplication.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "location")
public class Location {
	@Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long locationid;
	private String locationname;
//	@ManyToOne
//	@JoinColumn(name = "facilityid")
//	private Facility facility;
	public Location() {
		
	}
    public Location(long locationid,String locationname) {
		this.locationid = locationid;
		this.locationname = locationname;
	}
	public long getLocationid() {
		return locationid;
	}
	public void setLocationid(long locationid) {
		this.locationid = locationid;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	/*
	 * public Facility getFacility() { return facility; } public void
	 * setFacility(Facility facility) { this.facility = facility; }
	 */

}
