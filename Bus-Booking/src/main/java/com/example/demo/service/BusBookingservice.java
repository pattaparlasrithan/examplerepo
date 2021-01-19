package com.example.demo.service;


import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import com.example.demo.dto.BusAndAvailabilitydto;




public interface BusBookingservice {
	public List<BusAndAvailabilitydto> busAvailability(String source,String destination,
			DateFormat localdate);
	

}
