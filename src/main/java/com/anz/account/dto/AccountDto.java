package com.anz.account.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public class AccountDto {

@Getter
@Setter
private Long accountNumber;
	
	private String accountName;
	
	private String accountType;
	
	private String balanceDate;
	
	private String currency;
	
	private BigDecimal availableBalance;
	
		
}
