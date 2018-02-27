package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.bank.repository.accountDB.AccountDBInterface;

@Path("/account")
public class AccountEndpoint {
	
	@Inject
	private AccountDBInterface accountInterface;
	
	@Path("/ID")
	@GET
	@Produces({ "application/json" })
	public String getAccountID() {
		return accountInterface.getAccountID();
	}
	
	@Path("/AccountNo")
	@GET
	@Produces({ "application/json" })
	public String getAccountNo(String accountNo) {
		return accountInterface.getAccountNo(accountNo);
	}

	@Path("/Balance")
	@GET
	@Produces({ "application/json" })
	public float getBalance() {
		return accountInterface.getBalance();

	}
	@Path("/CustomerID")
	@GET
	@Produces({ "application/json" })
	public String getCustomerID(String customerID) {
		return accountInterface.getCustomerID(customerID);
	}
	public void setRepository(AccountDBInterface accountInterface) {
		this.accountInterface = accountInterface;
	}
}
