package com.qa.bank.repository.accountDB;

public interface AccountDBInterface {	
	public String getAccountNo(String accountID);
	
	public String getBalance(String accountID);
	
	public String getAccountAll(String accountID);
}
