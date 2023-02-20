package com.anz.account.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.account.dto.AccountTransactionDto;
import com.anz.account.mapper.AccountMapper;
import com.anz.account.repository.TransactionRepository;
import com.anz.account.service.TransactionService;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	public List<AccountTransactionDto> getTransactions(Long accountNumber) {
		return AccountMapper.MAPPER.mapToAccountTransaction(
				transactionRepository.findByAccountNumber(accountNumber));
	}

}
