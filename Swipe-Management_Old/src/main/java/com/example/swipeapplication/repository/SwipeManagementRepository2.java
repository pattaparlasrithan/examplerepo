package com.example.swipeapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



import com.example.swipeapplication.entity.Location;
@Repository
public interface SwipeManagementRepository2 extends JpaRepository<Location, Long>{
//	List<FacilityLocation> findByFacilityAndLocation();

}
