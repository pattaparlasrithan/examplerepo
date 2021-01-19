package com.example.demo.serviceimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DatabaseConnection;
import com.example.demo.dao.util.entity.Bus;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.example.demo.dto.BusAndAvailabilitydto;
import com.example.demo.exceptions.CustomException;
import com.example.demo.repositry.BookingRepository;
import com.example.demo.service.BusBookingservice;

@Service
public class BusBookingserviceimpl implements BusBookingservice{
	
	@Autowired
	BookingRepository bookingrepo;
	@Override
	public List<BusAndAvailabilitydto> busAvailability(String source,String destination,
			String localdate) {
		// TODO Auto-generated method stub
		final List<BusAndAvailabilitydto> busDetailsDtoList = new ArrayList<>();
		/*
		 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 * LocalDate userDate = LocalDate.parse(localdate, formatter);
		 * System.out.println("usr date>>>>>>>>>>>>>"+userDate);
		 */
//        if (userDate.isBefore(LocalDate.now()))
       //     throw new DayBeforeException(AppConstants.DAY_BEFORE_TODAY);
System.out.println("test...............................");
List<BusAndAvailabilitydto> busList = bookingrepo.findBySourceAndDestinationAndDay(source, destination,
        		localdate);
        
        if (!busList.isPresent()) {
    //        throw new BusNotFoundException(AppConstants.BUS_NOT_AVAILABLE);      
        busList.get().forEach(temp -> {
        	BusAndAvailabilitydto busDetailsDto = new BusAndAvailabilitydto();
            BeanUtils.copyProperties(temp, busDetailsDto);
            busDetailsDtoList.add(busDetailsDto);

 

        });
        
        
        }
		
		return busDetailsDtoList;
	}
	

}
