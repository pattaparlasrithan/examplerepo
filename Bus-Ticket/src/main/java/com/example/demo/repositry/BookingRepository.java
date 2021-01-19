package com.example.demo.repositry;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.util.entity.Bus;
import com.example.demo.dto.BusAndAvailabilitydto;

@Repository
public interface BookingRepository extends JpaRepository<Bus, Long> {
	
	List<BusAndAvailabilitydto> findBySourceAndDestinationAndDay(String bussource, String busdestination, String buslocaldate);
}
