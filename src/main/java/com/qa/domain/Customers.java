package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customers {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String CustomerID;
	
	private String fName;
	
	private String sName;

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public Customers(){
		
	}
	
	public Customers(String fName, String sName){
		this.fName = fName;
		this.sName =sName;
		
	}
	

}
