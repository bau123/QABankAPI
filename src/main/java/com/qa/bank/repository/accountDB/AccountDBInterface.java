package com.qa.bank.repository.accountDB;

public interface AccountDBInterface {	
	public String getAccountNo(String accountID);
	
	public String getBalance(String accountID);
	
	public String getBalance();
	
	public String getCustomerID(String customerID);
	public String getAccountAll(String accountID);
}
