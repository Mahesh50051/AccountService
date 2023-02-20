package com.anz.account.service;

import java.util.List;

import com.anz.account.dto.AccountTransactionDto;

public interface TransactionService {

	List<AccountTransactionDto> getTransactions(Long accountNumber);
}
