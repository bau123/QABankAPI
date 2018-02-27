package com.qa.integration;

import javax.inject.Inject;
import javax.persistence.PersistenceContext;
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


	@Path("/ID")
	@GET
	@Produces({ "application/json" })
	public String getTransactionID(String ID) {
		return transactionInterface.getTransactionID(ID);
	}

	@Path("/amount")
	@GET
	@Produces({ "application/json" })
	public String getAmount() {
		return transactionInterface.getAmount();
	}

	@Path("/newBalance")
	@GET
	@Produces({ "application/json" })
	public Float getNewBalance() {
		return transactionInterface.getNewBalance();

	}
	
	@Path("/transactionType")
	@GET
	@Produces({ "application/json" })
	public String getTransactionType() {
		return transactionInterface.getTransactionType();
	}
	
	
	@Path("/transactions/{fromDate}/{toDate}")
	@GET
	@Produces({ "application/json" })
	public String getAllTransactions(@PathParam("fromDate") String fromDate, @PathParam("toDate") String toDate){
		LOGGER.info("get transactions method");
		LOGGER.info("fromDate: " + fromDate);
		LOGGER.info("toDate: " + toDate);
		
		//getAllTransactions(fromDate, toDate);
		
		String transactionsJson = "[ { \"date\": \"test \", \"reference\": \"test \", \"_in\": \"test \", \"out\": \"test \", \"balance\": \"test \", \"type\": \"test \" }, { \"date\": \"test2 \", \"reference\": \"test2 \", \"_in\": \"test2 \", \"out\": \"test2 \", \"balance\": \"test2 \", \"type\": \"test2 \" } ] ";
		return transactionsJson;
	}
	
	
	public void setRepository(TransactionDBInterface transactionInterface) {
		this.transactionInterface = transactionInterface;
	}

}
