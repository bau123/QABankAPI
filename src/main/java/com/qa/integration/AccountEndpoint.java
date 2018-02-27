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
	
	@Path("/All")
	@GET
	@Produces({ "application/json" })
	public String getAccountAll(String accountID) {
		return accountInterface.getAccountAll(accountID);
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
	public String getBalance(String accountID) {
		return accountInterface.getBalance(accountID);

	}

	public void setRepository(AccountDBInterface accountInterface) {
		this.accountInterface = accountInterface;
	}
	
}
