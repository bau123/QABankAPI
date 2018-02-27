
package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.bank.repository.transactionDB.TransactionDBInterface;


@Path("/transaction")
public class TransactionEndpoint {
	private Logger LOGGER = Logger.getLogger(TransactionEndpoint.class);
	
	@Inject
	private TransactionDBInterface transactionInterface;


	@Path("/All/{accountNum}/{fromDate}/{toDate}")
	@GET
	@Produces({ "application/json" })
	public String getTransactionAll(@PathParam("accountNum") String accountNum, @PathParam("fromDate") String fromDate, @PathParam("toDate") String toDate) 
	{
		LOGGER.info("getTransactionAll method");
		LOGGER.info(accountNum);
		LOGGER.info(fromDate);
		LOGGER.info(toDate);
		return transactionInterface.getTransactionsAll(accountNum);
	}
	
	
	@Path("/average/{accountNum}/{fromDate}/{toDate}")
	@GET
	@Produces({ "application/json" })
	public String getAverage(@PathParam("accountNum") String accountNum, @PathParam("fromDate") String fromDate, @PathParam("toDate") String toDate) {
		LOGGER.info("getAverage method");
		LOGGER.info(accountNum);
		LOGGER.info(fromDate);
		LOGGER.info(toDate);
		return transactionInterface.getTransactionsAll(accountNum);
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
