package com.anz.account.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.account.dto.AccountDto;
import com.anz.account.mapper.AccountMapper;
import com.anz.account.repository.AccountRepository;
import com.anz.account.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public List<AccountDto> getAccounts() {
	
		return AccountMapper.MAPPER.mapToAccount(accountRepository.findAll());
	}
}
