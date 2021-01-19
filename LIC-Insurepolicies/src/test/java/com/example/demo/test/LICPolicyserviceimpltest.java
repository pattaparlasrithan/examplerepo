package com.example.demo.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.demo.exceptions.CustomException;
import com.example.demo.service.LICPolicyservice;
import com.example.demo.serviceimpl.LICPolicyserviceimpl;

@TestInstance(Lifecycle.PER_CLASS)
public class LICPolicyserviceimpltest {
	LICPolicyservice service;
	@BeforeAll
	public void setup() {
		service = new LICPolicyserviceimpl();
	}
	@Test
	@DisplayName("Get the list of policies")
	public void getDataList() {
		List lst = service.getDataList();
		assertEquals(lst, lst);
		
	}
	@Test
	@DisplayName("Get the list of EMPdata")
	public void getEMPDataList() {
		List lst = service.getEMPDataList();
		assertEquals(lst, lst);
		
	}
	@Test
	@DisplayName("Get trend of the policy")
//	@ParameterizedTest(name = "To get the policy id{0}")
//	@ValueSource(ints = {1,2,3,4})
	public void getTrendCount() throws CustomException {
		int policyid = 3;
		List lst = service.getTrendCount(policyid);
		assertEquals(lst, lst);
		
	}

}
