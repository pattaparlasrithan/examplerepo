package com.example.swipeapplication.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.swipeapplication.entity.Facility;
import com.example.swipeapplication.entity.Location;
import com.example.swipeapplication.repository.SwipeManagementRepository;
import com.example.swipeapplication.service.SwipeManagementService;
import com.example.swipeapplication.serviceimpl.SwipeManagementServiceImpl;

@TestInstance(Lifecycle.PER_CLASS)
public class SwipeManagementTest {
	SwipeManagementService service;
	@Autowired
    SwipeManagementRepository smRepository;
	@BeforeAll
	public void setup() {
		service = new SwipeManagementServiceImpl();
	}

	  @Test
	  
	  @DisplayName("Get the list of facilities")
	  
	  @Order(value = 1) 
	  public void getFacilities() { 
	  List<Facility> lf = new ArrayList<Facility>(); 
	  List<Facility> lst = service.getFacilities(); 
	  assertEquals(lf, lst); Assertions.assertNotNull(lst);
	  
	  }
	 
	@Test
	@DisplayName("Save Update the record")
	@Order(value = 2)
	public void saveOrUpdate() {
		
		Location lo = new Location(107, "HYD");
		List<Location> lst = new ArrayList<Location>();
		lst.add(lo);
		Facility facility = new Facility(3,"ELCOT-SEZ",lst);
		when(smRepository.save(facility)).thenReturn(facility);
        assertEquals(facility, service.saveOrUpdate(facility));
		/*
		 * System.out.println("facility====="+facility.getFacilityid()+" "+facility.
		 * getFacilityname()+" "+facility.getLocations().toString()); Facility fac =
		 * service.saveOrUpdate(facility);
		 * System.out.println("after facility====="+fac);
		 * System.out.println(fac.getFacilityid()+" "+fac.getFacilityname()+" "+fac.
		 * getLocations()); assertEquals(lo,lo );
		 */
//		Assertions.assertNotNull(fac);
		
	}
	/*
	 * @Test
	 * 
	 * @DisplayName("Delete the record")
	 * 
	 * @Order(value = 3) // @ParameterizedTest(name = "To get the policy id{0}")
	 * // @ValueSource(ints = {1,2,3,4}) public void delete() { long facilityid = 2;
	 * service.delete(facilityid); assertEquals(facilityid, facilityid);
	 * 
	 * }
	 */

}
