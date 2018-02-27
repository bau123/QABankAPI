package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.bank.repository.transactionDB.TransactionDBInterface;

@Path("/transaction")
public class TransactionEndpoint {
	
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
	public void setRepository(TransactionDBInterface transactionInterface) {
		this.transactionInterface = transactionInterface;
	}

}
