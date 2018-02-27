package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.bank.repository.customerDB.CustomerDBInterface;

@Path("/customer")
public class CustomerEndpoint{
	
	@Inject
	private CustomerDBInterface customerInterface;
	
	@Path("/All")
	@GET
	@Produces({ "application/json" })
	public String getCustomerAll(String customerID) {
		return customerInterface.getCustomerAll(customerID);
	}

	@Path("/firstName")
	@GET
	@Produces({ "application/json" })
	public String getFirstName(String customerID) {
		return customerInterface.getFirstName(customerID);
	}

	@Path("/lastName")
	@GET
	@Produces({ "application/json" })
	public String getLastName(String customerID) {
		return customerInterface.getLastName(customerID);

	}

	public void setRepository(CustomerDBInterface customerInterface) {
		this.customerInterface = customerInterface;
	}
}
