package com.example.demo.serviceimpl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jms.Queue;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InsurenceTicket;
import com.example.demo.dto.InsurenceRequestDto;

import com.example.demo.repo.InsurenceTicketRepository;

import com.example.demo.service.InsurenceService;


@Service
public class InsurenceServiceimpl implements InsurenceService{

	@Autowired
	Queue queue;	
	@Autowired
	JmsTemplate template;	
	/*
	 * @Autowired UserDetailsRepository userDetailsRepository;
	 * 
	 * @Autowired TicketReservationRepository ticketReservationRepository;
	 */
	@Autowired
	InsurenceTicketRepository insurenceTicketRepo;
	

	@Override
	public String insurenceTicket(InsurenceRequestDto insurencerequest) {
		String response = null;
		BigDecimal bdecimal = new BigDecimal(0.1);
		InsurenceTicket insurenceTicket = new InsurenceTicket();
		Long ticketId = insurencerequest.getTicketId();
		BigDecimal bd = insurencerequest.getTotalCost();
		bd.multiply(bdecimal);
		if(!insurenceTicketRepo.existsById(ticketId))
//			throw new CustomerNotFundException("Invalid User Id");
		BeanUtils.copyProperties(insurencerequest, insurenceTicket);
		insurenceTicketRepo.save(insurenceTicket);
		template.convertAndSend(queue,insurencerequest);
		response="Insurence processing";
		return response;
	}
	
}
