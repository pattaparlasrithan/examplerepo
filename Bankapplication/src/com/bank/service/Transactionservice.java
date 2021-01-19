package com.bank.service;

import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.dto.Translist;

public interface Transactionservice {
	public List<Translist> getDataList();

}
