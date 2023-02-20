package com.anz.account.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name ="payment_account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;
		
	private Long accountNumber;
	
	private String accountName;
	
	private String accountType;
	
	private String balanceDate;
	
	private String currency;
	
	private BigDecimal availableBalance;

}
