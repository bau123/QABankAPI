package com.qa.bank.repository.accountDB;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.domain.Account;
import com.qa.util.JSONUtil;

public class AccountDBRepository implements AccountDBInterface{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager entityManager;
	
	@Inject 
	private JSONUtil jsonUtil;

	@Override
	public String getAccountID() {
		Query query = entityManager.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return jsonUtil.getJSONForObject(accounts);
	}

	@Override
	public String getAccountNo(String accountNo) {
		Query query = entityManager.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return jsonUtil.getJSONForObject(accounts);
	}

	@Override
	public float getBalance() {
		Query query = entityManager.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return 5.00F;
	}

	@Override
	public String getCustomerID(String customerID) {
		Query query = entityManager.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return jsonUtil.getJSONForObject(accounts);
	}

}
