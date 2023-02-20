package com.anz.account.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name ="payment_account_transacation")
public class AccountTransaction {
	
	@Id
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
