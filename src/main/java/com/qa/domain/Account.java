package com.qa.domain;


import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Account {


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String accountID;
	
	private String accountNo;
	
	@Column(columnDefinition="Decimal(10,2)")
	private double balance;
	
	@JoinColumn(name = "CustomerID")
	private String customerId;
  
	public Account() {

	}

	public Account(String accountNumber, Float balance, String accountID) {
		this.accountNo = accountID;
		this.balance = balance;
		this.accountID = accountID;
	}

	public String getAccountNumber() {
		return accountNo;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNo = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getCustomerID() {
		return customerId;
	}

	public void setCustomerID(String customerID) {
		this.customerId = customerID;
	}
}


