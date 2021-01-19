package com.example.demo.dto;

import lombok.Data;

@Data
public class LICPolicydto {
    private int policyId;
    private String PolicyName;
    private String minEntryAge;
    private String maximumMaturityAge;
    private String minPolicyTerm;
    private String MinimumPremium;
    private String MinSumAssured;
    private String poilicyDesc;
    private String maxEntryAge;    
    private String maxPolicyTerm;
	public LICPolicydto(int policyId, String policyName, String minEntryAge, String maximumMaturityAge,
			String minPolicyTerm, String minimumPremium, String minSumAssured, String poilicyDesc, String maxEntryAge,
			String maxPolicyTerm) {
		super();
		this.policyId = policyId;
		PolicyName = policyName;
		this.minEntryAge = minEntryAge;
		this.maximumMaturityAge = maximumMaturityAge;
		this.minPolicyTerm = minPolicyTerm;
		MinimumPremium = minimumPremium;
		MinSumAssured = minSumAssured;
		this.poilicyDesc = poilicyDesc;
		this.maxEntryAge = maxEntryAge;
		this.maxPolicyTerm = maxPolicyTerm;
	}
	public int getPolicyId() {
		return policyId;
	}
	public String getPolicyName() {
		return PolicyName;
	}
	public String getMinEntryAge() {
		return minEntryAge;
	}
	public String getMaximumMaturityAge() {
		return maximumMaturityAge;
	}
	public String getMinPolicyTerm() {
		return minPolicyTerm;
	}
	public String getMinimumPremium() {
		return MinimumPremium;
	}
	public String getMinSumAssured() {
		return MinSumAssured;
	}
	public String getPoilicyDesc() {
		return poilicyDesc;
	}
	public String getMaxEntryAge() {
		return maxEntryAge;
	}
	public String getMaxPolicyTerm() {
		return maxPolicyTerm;
	}    
    
	
	
}
