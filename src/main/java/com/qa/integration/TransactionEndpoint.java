package com.qa.integration;

import javax.inject.Inject;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.bank.repository.transactionDB.TransactionDBInterface;

@Path("/transaction")
public class TransactionEndpoint {
	
	@Inject
	private TransactionDBInterface transactionInterface;


	@Path("/All")
	@GET
	@Produces({ "application/json" })
	public String getTransactionAll(String transactionID) {
		return transactionInterface.getTransactionsAll(transactionID);
	}

	@Path("/amount")
	@GET
	@Produces({ "application/json" })
	public String getAmount(String transactionID) {
		return transactionInterface.getAmount(transactionID);
	}

	@Path("/newBalance")
	@GET
	@Produces({ "application/json" })
	public String getUpdatedBalance(String transactionID) {
		return transactionInterface.getUpdatedBalance(transactionID);

	}
	
	@Path("/Dates")
	@GET
	@Produces({ "application/json" })
	public String getDateOfTransactions(String transactionID) {
		return transactionInterface.getDateOfTransactions(transactionID);
	}
	
	@Path("/Deposit_Withdrawal")
	@GET
	@Produces({ "application/json" })
	public String getDepositWithdrawal(String transactionID) {
		return transactionInterface.getDepositWithdrawal(transactionID);
	}
	
	@Path("/transactionType")
	@GET
	@Produces({ "application/json" })
	public String getTransactionType(String transactionID) {
		return transactionInterface.getTransactionType(transactionID);
	}
	
	@Path("/transactionType")
	@GET
	@Produces({ "application/json" })
	public String getDescription(String transactionID) {
		return transactionInterface.getDescription(transactionID);
	}
	
	public void setRepository(TransactionDBInterface transactionInterface) {
		this.transactionInterface = transactionInterface;
	}
}
