package com.qa.bank.repository.transactionDB;

public interface TransactionDBInterface {
	
	public String getAmount(String accountID);
	
	public String getUpdatedBalance(String accountID);
	
	public String getTransactionType(String accountID);
	
	public String getAccountID(String accountID);
	
	public String getDateOfTransactions(String accountID);
	
	public String getDepositWithdrawal(String accountID);
	
	public String getTransactionsAll();
	
	public String getDescription(String accountID);
	
}
