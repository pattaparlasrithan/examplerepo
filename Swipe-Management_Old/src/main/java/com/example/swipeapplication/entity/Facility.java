package com.example.swipeapplication.entity;



import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "facility")
public class Facility {
	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long facilityid;
	private String facilityname;
	@OneToMany(targetEntity = Location.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "facility")
//	@JoinColumn(name = "locations")
	private List<Location> locations;
	public Facility() {
		
	}
	public Facility(long facilityid,String facilityname,List<Location> locations) {
		this.facilityid = facilityid;
		this.facilityname = facilityname;
		this.locations = locations;
	}
	public long getFacilityid() {
		return facilityid;
	}
	public void setFacilityid(long facilityid) {
		this.facilityid = facilityid;
	}
	public String getFacilityname() {
		return facilityname;
	}
	public void setFacilityname(String facilityname) {
		this.facilityname = facilityname;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	

}
