package com.bank.dto;

import java.util.Date;

public class Translist {
	private long transid;
	private long accountno;
	private long amount;
	private Date tdate;
	private String type;
	public Translist(long transid, long accountno, long amount, Date tdate, String type) {
		super();
		this.transid = transid;
		this.accountno = accountno;
		this.amount = amount;
		this.tdate = tdate;
		this.type = type;
	}
	public long getTransid() {
		return transid;
	}
	public long getAccountno() {
		return accountno;
	}
	public long getAmount() {
		return amount;
	}
	public Date getTdate() {
		return tdate;
	}
	public String getType() {
		return type;
	}

}
