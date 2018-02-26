package com.qa.bank.repository.accountDB;

public interface AccountDBInterface {
	public String getAccountID();
	
	public String getAccountNo(String accountNo);
	
	public float getBalance();
	
	public String getCustomerID(String customerID);
}
