package com.qa.integration;

import javax.inject.Inject;

import com.qa.bank.repository.transactionDB.TransactionDBRepository;

public class TransactionEndpoint {
	
	@Inject
	private TransactionDBRepository transactionRepo;

}
