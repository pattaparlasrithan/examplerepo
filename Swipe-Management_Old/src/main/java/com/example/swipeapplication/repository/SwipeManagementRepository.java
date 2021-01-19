package com.example.swipeapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.example.swipeapplication.entity.Facility;
@Repository
public interface SwipeManagementRepository extends JpaRepository<Facility, Long>{
//	List<FacilityLocation> findByFacilityAndLocation();

}
