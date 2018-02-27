package com.qa.bank.repository.accountDB;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.domain.Account;
import com.qa.domain.Customers;
import com.qa.util.JSONUtil;

public class AccountDBRepository implements AccountDBInterface{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager entityManager;
	
	@Inject 
	private JSONUtil jsonUtil;
	
	private static final String ACCOUNT_ACCOUNTNO_COLUMN = "SELECT ACCOUNTNO FROM ACCOUNT WHERE ACCOUNTID = ";
    private static final String ACCOUNT_GETBALANCE_COLUMN = "SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID = ";
    private static final String ACCOUNT_GETALL = "SELECT * FROM ACCOUNT WHERE ACCOUNTID = ";
    private Query query;
    
	@Override
	public String getAccountNo(String accountID) {
		query = entityManager.createQuery(ACCOUNT_ACCOUNTNO_COLUMN + "'" + accountID + "'");
	    Collection<Account> accountCollection = (Collection<Account>) query.getResultList();
	    return jsonUtil.getJSONForObject(accountCollection);
	}
	@Override
	public String getBalance(String accountID) {
		query = entityManager.createQuery(ACCOUNT_GETBALANCE_COLUMN + "'" + accountID + "'");
	    Collection<Account> accountCollection = (Collection<Account>) query.getResultList();
	    return jsonUtil.getJSONForObject(accountCollection);
	}    
	@Override
	public String getAccountAll(String accountID) {
		query = entityManager.createQuery(ACCOUNT_GETALL + "'" + accountID + "'");
	    Collection<Account> accountCollection = (Collection<Account>) query.getResultList();
	    return jsonUtil.getJSONForObject(accountCollection);
	}	
	public void setManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void setUtil(JSONUtil jsonUtil) {
		this.jsonUtil = jsonUtil;
	}
}
