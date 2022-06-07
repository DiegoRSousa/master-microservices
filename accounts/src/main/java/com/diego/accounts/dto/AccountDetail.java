package com.diego.accounts.dto;

import com.diego.accounts.model.Account;
import com.diego.accounts.model.AccountType;

import java.time.LocalDate;

public class AccountDetail {
	
	private Long id;
    private String number;
	private String customerName;
	private String customerNumber;
    private AccountType type;
    private LocalDate createdAt = LocalDate.now();
    
    public AccountDetail() {}
    
	public AccountDetail(Account account) {
		this.id = account.getId();
		this.number = account.getNumber();
		this.customerName = account.getCustomer().getName();
		this.customerNumber = account.getCustomer().getNumber();
		this.type = account.getType();
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public AccountType getType() {
		return type;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}
}
