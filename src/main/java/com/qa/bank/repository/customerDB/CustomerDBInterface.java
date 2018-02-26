package com.qa.bank.repository.customerDB;

public interface CustomerDBInterface {
	public String getAccountID();
	
	public String getAccountNo(String accountNo);
	
	public float getBalance();
	
	public String getCustomerID(String customerID);
}
