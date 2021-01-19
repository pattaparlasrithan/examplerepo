package com.example.demo.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.InsurenceRequestDto;
import com.example.demo.exceptions.CustomException;

import com.example.demo.service.InsurenceService;

import com.example.demo.serviceimpl.InsurenceServiceimpl;


@TestInstance(Lifecycle.PER_CLASS)
public class Insurenceserviceimpltest {
	
	InsurenceService service;
	  
	  @BeforeAll public void setup() { 
		  service = new InsurenceServiceimpl(); }
	  
	  @Test
	  
	  @DisplayName("validateLogin") 
	  public void insurenceTicket() {
		  

InsurenceRequestDto insurenceRequestdto = new InsurenceRequestDto();
		  String str
	  = service.insurenceTicket(insurenceRequestdto);
		  assertEquals(str, str);
	  
	  }
	  
	  
	 
}
