package com.example.demo.dao;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "T_ticket_reservation")
public class InsurenceTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int insurenceId;
    private int ticketId;
    private int userId;
    private BigDecimal ticketamount;
    private BigDecimal insurenceAmount;
	private String bookingStatus="Pending";

}

