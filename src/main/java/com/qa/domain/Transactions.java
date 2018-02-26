package com.qa.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Transactions {
	
	@Id
	private String TransactionID;
	
	@Column(columnDefinition="Decimal(10,2)")
	private double amount;
	
	private String TransactionType;
	
	private String Description;
	
	private String dateOfTransaction;
	
	private String Deposit_Withdrawal;
	
	@Column(columnDefinition="Decimal(10,2)")
	private double updatedBalance;
	
	@JoinColumn(name ="AccountID")
	private String AccountID;
	
	
}
