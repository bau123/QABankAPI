package com.qa.domain;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Account {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String AccountID;
	
	private String accountNo;
	
	@Column(columnDefinition="Decimal(10,2)")
	private double balance;
	
	@JoinColumn(name = "CustomerID")
	private String CustomerId;

}
