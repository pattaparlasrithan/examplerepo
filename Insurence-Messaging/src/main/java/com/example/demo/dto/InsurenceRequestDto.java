package com.example.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class InsurenceRequestDto implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private int insurenceId;
    private long ticketId;
    private long userId;
    private BigDecimal totalCost;
    private BigDecimal insurenceAmount;
    public InsurenceRequestDto() {
    	
    }
	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}
	public void setInsurenceAmount(BigDecimal insurenceAmount) {
		this.insurenceAmount = insurenceAmount;
	}
	public long getTicketId() {
		return ticketId;
	}
	public long getUserId() {
		return userId;
	}
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	public BigDecimal getInsurenceAmount() {
		return insurenceAmount;
	}
    
	
	
}
