package com.example.demo.service;


import java.util.List;

import com.example.demo.dto.EMPPolicydto;
import com.example.demo.dto.EMPPolicydtotrend;
import com.example.demo.dto.LICPolicydto;
import com.example.demo.exceptions.CustomException;




public interface LICPolicyservice {
	public List<LICPolicydto> getDataList();
	public List<EMPPolicydto> getEMPDataList();
	public List<EMPPolicydtotrend> getTrendCount(int policyid) throws CustomException;

}
