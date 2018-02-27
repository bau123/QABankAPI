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
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String transactionID;
	
	@Column(columnDefinition="Decimal(10,2)")
	private double amount;
	
	private String transactionType;
	
	private String description;
	
	private Date dateOfTransaction;
	
	private String deposit_Withdrawal;
	
	@Column(columnDefinition="Decimal(10,2)")
	private double updatedBalance;
	
	@JoinColumn(name ="AccountID")
	private String accountID;
	
	
	public Transactions(){
		
	}
	
	public Transactions(String accountID, String deposit_Withdrawal,
						String description, String transactionType, double amount, Date dateOfTransaction, 
						double udpatedBalance){
		
			this.accountID = accountID;
			this.deposit_Withdrawal = deposit_Withdrawal;
			this.description = description;
			this.transactionType = transactionType;
			this.amount = amount;
			this.dateOfTransaction = dateOfTransaction;
			this.updatedBalance = updatedBalance;
		
	}
	
	
}
