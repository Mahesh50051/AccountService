package com.anz.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anz.account.dto.AccountDto;
import com.anz.account.dto.AccountTransactionDto;
import com.anz.account.service.AccountService;
import com.anz.account.service.TransactionService;

@RestController
public class AccountController {

	@Autowired
	AccountService  accountService;
	
	@Autowired
	TransactionService transactionService;
	
	@GetMapping(value = "/account")
	public ResponseEntity<List<AccountDto>> getAccounts() {
		
		List<AccountDto> accounts = accountService.getAccounts();
		
		if (CollectionUtils.isEmpty(accounts)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(accounts, HttpStatus.OK);
	}
	
	@GetMapping(value = "/transaction/{accountNumber}")
	public ResponseEntity<List<AccountTransactionDto>> getTransactions(@PathVariable(required = true) Long accountNumber) {
		
		List<AccountTransactionDto> transactions = transactionService.getTransactions(accountNumber);
		
		if (CollectionUtils.isEmpty(transactions)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(transactions, HttpStatus.OK);
	}
}
