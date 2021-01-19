package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InsurenceRequestDto;
import com.example.demo.service.InsurenceService;

@RestController
@RequestMapping("/insurence")
public class InsurenceRestController {
	@Autowired
	InsurenceService insurenceService;

	@PostMapping("/ticket")
	public String insurenceTicket(@RequestBody InsurenceRequestDto insurencerequest) {
		return 	insurenceService.insurenceTicket(insurencerequest);
	}

}
