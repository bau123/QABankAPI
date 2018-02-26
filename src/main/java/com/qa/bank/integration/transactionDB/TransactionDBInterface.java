package com.qa.bank.integration.transactionDB;

public interface TransactionDBInterface {
		
	public String getTransactionID();
	
	public String getAmount();
	
	public String getNewBalance();
	
	public String getTransactionType();
}
