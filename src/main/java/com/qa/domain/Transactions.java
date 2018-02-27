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
	private String transactionID;
	
	@Column(columnDefinition="Decimal(10,2)")
	private double amount;
	
	private String transactionType;
	
	private String description;
	
	private String dateOfTransaction;
	
	private String deposit_Withdrawal;
	
	@Column(columnDefinition="Decimal(10,2)")
	private double updatedBalance;
	
	@JoinColumn(name ="AccountID")
	private String AccountID;

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		transactionType = transactionType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		description = description;
	}

	public String getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(String dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public String getDeposit_Withdrawal() {
		return deposit_Withdrawal;
	}

	public void setDeposit_Withdrawal(String deposit_Withdrawal) {
		this.deposit_Withdrawal = deposit_Withdrawal;
	}
	
	
}
