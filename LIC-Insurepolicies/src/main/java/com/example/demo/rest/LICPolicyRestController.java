package com.example.demo.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EMPPolicydto;
import com.example.demo.dto.EMPPolicydtotrend;
import com.example.demo.dto.LICPolicydto;
import com.example.demo.exceptions.CustomException;
import com.example.demo.service.LICPolicyservice;
import com.example.demo.serviceimpl.LICPolicyserviceimpl;

@RestController
public class LICPolicyRestController {
	/*
	 * @GetMapping(value = "/policies", consumes = { "application/JSON",
	 * "application/XML" }, produces = { "application/JSON", "application/XML" })
	 */
	@GetMapping("/policies")
	public ResponseEntity<List<LICPolicydto>> getAllPolicies() {
//		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		LICPolicyservice connforpolicy = new LICPolicyserviceimpl();
		List<LICPolicydto> list = connforpolicy.getDataList();
//		LICPolicydto licpdto1 = null;
		for (LICPolicydto licpdto : list) {
			licpdto.getPolicyId();
			licpdto.getPolicyName();
			licpdto.getMinEntryAge();
			licpdto.getMaximumMaturityAge();
			licpdto.getMinPolicyTerm();
			licpdto.getMinimumPremium();
			licpdto.getMinSumAssured();
			licpdto.getMaxEntryAge();
			licpdto.getMaxPolicyTerm();

			/*
			 * System.out.println(
			 * "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"
			 * + licpdto.getPolicyId() + " " + licpdto.getPolicyName() + " " +
			 * licpdto.getMinEntryAge() + " " + licpdto.getMaximumMaturityAge() + " " +
			 * licpdto.getMinPolicyTerm() + " " + licpdto.getMinimumPremium() + " " +
			 * licpdto.getMinSumAssured() + " " + licpdto.getMaxEntryAge() + " " +
			 * licpdto.getMaxPolicyTerm());
			 */
//			licpdto1 = licpdto;
		}
		
		return new ResponseEntity<List<LICPolicydto>>(list, HttpStatus.OK);

	}

	
	@GetMapping("/latestEmpPolicy")
	public ResponseEntity<List<EMPPolicydtotrend>> getLatestEmpPolicy(@RequestParam int policyid) throws CustomException{
		
		
		LICPolicyservice connforemppolicy = new LICPolicyserviceimpl(); 
		List<EMPPolicydtotrend> trend = connforemppolicy.getTrendCount(policyid);
		
		return new ResponseEntity<List<EMPPolicydtotrend>>(trend,HttpStatus.OK);
	}
	

}
