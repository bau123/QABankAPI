package com.qa.bank.repository.transactionDB;

public interface TransactionDBInterface {
		
	public String getTransactionID(String ID);
	
	public String getAmount();
	
	public Float getNewBalance();
	
	public String getTransactionType();
}
