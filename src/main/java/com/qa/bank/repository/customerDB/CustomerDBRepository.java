package com.qa.bank.repository.customerDB;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.domain.Customers;
import com.qa.domain.Customers;
import com.qa.util.JSONUtil;

public class CustomerDBRepository implements CustomerDBInterface{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager entityManager;
	
	@Inject 
	private JSONUtil jsonUtil;

	private static final String CUSTOMER_FIRSTNAME_COLUMN = "SELECT fNAME FROM CUSTOMERS WHERE CUSTOMERID = ";
    private static final String CUSTOMER_LASTNAME_COLUMN = "SELECT sNAME FROM CUSTOMERS WHERE CUSTOMERID = ";
    private static final String CUSTOMER_GETALL = "SELECT * FROM CUSTOMERS WHERE CUSTOMERID = ";
    private Query query;    

	@Override
	public String getFirstName(String customerID) {
		query = entityManager.createQuery(CUSTOMER_FIRSTNAME_COLUMN + "'" + customerID + "'");
	    Collection<Customers> customerCollection = (Collection<Customers>) query.getResultList();
	    return jsonUtil.getJSONForObject(customerCollection);
	}

	@Override
	public String getLastName(String customerID) {
		query = entityManager.createQuery(CUSTOMER_LASTNAME_COLUMN + "'" + customerID + "'");
	    Collection<Customers> customerCollection = (Collection<Customers>) query.getResultList();
	    return jsonUtil.getJSONForObject(customerCollection);
	}
	@Override
	public String getCustomerAll(String customerID) {
		query = entityManager.createQuery(CUSTOMER_GETALL + "'" + customerID + "'");
	    Collection<Customers> customerCollection = (Collection<Customers>) query.getResultList();
	    return jsonUtil.getJSONForObject(customerCollection);
	}
	
	public void setManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void setUtil(JSONUtil jsonUtil) {
		this.jsonUtil = jsonUtil;
	}
}

