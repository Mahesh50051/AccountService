package com.anz.account.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountTransactionDto {

	private Long transactionId;
	
	private Long accountNumber;
	
	private String accountName;
	
	private String valueDate;
	
	private String currency;
	
	private BigDecimal debitAmount;
	
	private BigDecimal creditAmount;
	
	private String transactionType;
	
	private String transactionNarrative;
	
		
}
