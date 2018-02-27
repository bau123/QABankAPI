package com.qa.bank.repository.customerDB;

public interface CustomerDBInterface {
	public String getFirstName(String customerID);
	
	public String getLastName(String customerID);
	
	public String getCustomerAll(String customerID);
}
