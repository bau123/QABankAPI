package com.qa.bank.repository.transactionDB;

import com.qa.domain.Transactions;
import com.qa.util.JSONUtil;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

public class TransactionDBRepository implements TransactionDBInterface{

	@PersistenceContext (unitName = "primary")
	private EntityManager entityManager;

	@Inject
	private JSONUtil jsonUtil;

	private static final String TRANSACTION_ID_COLUMN = "SELECT TRANSACTIONID FROM TRANSACTIONS WHERE ACCOUNTID = ";
	private static final String TRANSACTION_AMOUNT_COLUMN = "SELECT AMOUNT FROM TRANSACTIONS WHERE ACCOUNTID = ";
	private static final String TRANSACTION_NEWBALANCE_COLUMN = "SELECT UPDATEDBALANCE FROM TRANSACTIONS WHERE ACCOUNTID = ";
	private static final String TRANSACTION_TYPE_COLUMN = "SELECT TRANSACTIONTYPE FROM TRANSACTIONS WHERE ACCOUNTID = ";
	private static final String TRANSACTION_ACCOUNT_ID_COLUMNS = "SELECT ACCOUNTID FROM TRANSACTIONS WHERE ACCOUNTID = ";
	private static final String TRANSACTION_DATEOFTRANSACTION_COLUMNS = "SELECT DATEOFTRANSACTION FROM TRANSACTIONS WHERE ACCOUNTID = ";
	private static final String TRANSACTION_DEPOSIT_WITHDRAWAL_COLUMNS = "SELECT DEPOSIT_WITHDRAWAL FROM TRANSACTIONS WHERE ACCOUNTID = ";
	private static final String TRANSACTION_DESCRIPTION_COLUMNS = "SELECT DEPOSIT_WITHDRAWAL FROM TRANSACTIONS WHERE ACCOUNTID = ";
	private static final String TRANSACTION_ALL_COLUMNS = "SELECT e FROM Transactions e WHERE ACCOUNTID = ";
	
	
	private Query query;
	
	@Override
	public String getAmount(String accountID) {
		query = entityManager.createQuery(TRANSACTION_AMOUNT_COLUMN + "'" + accountID + "'");
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		return jsonUtil.getJSONForObject(transactionCollection);
	}
	@Override
	public String getUpdatedBalance(String accountID) {
		query = entityManager.createQuery(TRANSACTION_NEWBALANCE_COLUMN + "'" + accountID + "'");
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		return jsonUtil.getJSONForObject(transactionCollection);
	}
	@Override
	public String getTransactionType(String accountID) {
		query = entityManager.createQuery(TRANSACTION_TYPE_COLUMN + "'" + accountID + "'");
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		
		return jsonUtil.getJSONForObject(transactionCollection);
	}
	@Override
	public String getAccountID(String accountID) {
		query = entityManager.createQuery(TRANSACTION_ACCOUNT_ID_COLUMNS + "'" + accountID + "'");
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		return jsonUtil.getJSONForObject(transactionCollection);
	}
	@Override
	public String getDateOfTransactions(String accountID) {
		query = entityManager.createQuery(TRANSACTION_DATEOFTRANSACTION_COLUMNS + "'" + accountID + "'");
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		return jsonUtil.getJSONForObject(transactionCollection);
	}
	@Override
	public String getDepositWithdrawal(String accountID) {
		query = entityManager.createQuery(TRANSACTION_DEPOSIT_WITHDRAWAL_COLUMNS + "'" + accountID + "'");
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		return jsonUtil.getJSONForObject(transactionCollection);
	}
	@Override
	public String getDescription(String accountID) {
		query = entityManager.createQuery(TRANSACTION_DESCRIPTION_COLUMNS + "'" + accountID + "'");
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		return jsonUtil.getJSONForObject(transactionCollection);
	}
	/**
	@Override
	public String getTransactionsAll(String accountID) {
		query = entityManager.createQuery(TRANSACTION_ALL_COLUMNS);
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		return jsonUtil.getJSONForObject(transactionCollection);
	}
	*/
	
	@Override
	public String getTransactionsAll(String accountID) {
		query = entityManager.createQuery(TRANSACTION_ALL_COLUMNS + "'" + accountID + "'");
		Collection<Transactions> transactionCollection = (Collection<Transactions>) query.getResultList();
		return jsonUtil.getJSONForObject(transactionCollection);
	}


}

