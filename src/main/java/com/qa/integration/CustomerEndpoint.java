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
	
	@Path("/ID")
	@GET
	@Produces({ "application/json" })
	public String getCustomerID(String ID) {
		return customerInterface.getCustomerID(ID);
	}

	@Path("/firstName")
	@GET
	@Produces({ "application/json" })
	public String getFirstName() {
		return customerInterface.getFirstName();
	}

	@Path("/lastName")
	@GET
	@Produces({ "application/json" })
	public String getLastName() {
		return customerInterface.getLastName();

	}
	@Path("/Address")
	@GET
	@Produces({ "application/json" })
	public String getAddress() {
		return customerInterface.getAddress();
	}
	public void setRepository(CustomerDBInterface customerInterface) {
		this.customerInterface = customerInterface;
	}
}
