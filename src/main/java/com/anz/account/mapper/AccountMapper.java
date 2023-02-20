package com.anz.account.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.anz.account.dto.AccountDto;
import com.anz.account.dto.AccountTransactionDto;
import com.anz.account.model.Account;
import com.anz.account.model.AccountTransaction;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class AccountMapper {
	
	public static final AccountMapper MAPPER = Mappers.getMapper(AccountMapper.class);

	public abstract List<AccountDto> mapToAccount(List<Account> accounts);

	public abstract List<AccountTransactionDto> mapToAccountTransaction(List<AccountTransaction> transactions);
}
