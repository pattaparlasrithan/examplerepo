package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*@Getter
@Setter*/
@Component
/*
 * @Data
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 */
@Entity
@Table(name = "order_TB")
public class Order {
	@Id
	private int oid;
	private String oname;
	private String ocatagery;
	private double oamount;
	public Order(int oid, String oname, String ocatagery, double oamount) {
//		super();
		this.oid = oid;
		this.oname = oname;
		this.ocatagery = ocatagery;
		this.oamount = oamount;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getOcatagery() {
		return ocatagery;
	}
	public void setOcatagery(String ocatagery) {
		this.ocatagery = ocatagery;
	}
	public double getOamount() {
		return oamount;
	}
	public void setOamount(double oamount) {
		this.oamount = oamount;
	}

}
