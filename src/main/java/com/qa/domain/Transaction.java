package com.qa.domain;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long transactionID;
	private String accountID;
	private Date date;
	private String description;
	private String transactionType;
	private Float deposits;
	private Float withdrawals;
	private Float balance;

	public Transaction() {

	}

	public Transaction(Date date, String description, String transactionType) {
		this.date = date;
		this.description = description;
		this.transactionType = transactionType;
	}

	public Date getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public Float getDeposits() {
		return deposits;
	}
	public void setDeposits(Float deposits) {
		this.deposits = deposits;
	}
	public Float getWithdrawals() {
		return withdrawals;
	}
	public void setWithdrawals(Float withdrawals) {
		this.withdrawals = withdrawals;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
}


