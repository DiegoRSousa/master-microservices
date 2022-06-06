package com.diego.accounts.dto;

import java.time.LocalDate;

import com.diego.accounts.model.Account;

public class AccountDetail {
	
	private Long id;
    private String number;
    private AccountType type;
    private String branchAddress;
    private LocalDate createdAt;
    
    public AccountDetail() {}
    
	public AccountDetail(Account account) {
		this.id = account.getId();
		this.number = account.getNumber();
		this.type = account.getType();
		this.branchAddress = acc;
		this.createdAt = createdAt;
	}
	public Long getId() {
		return id;
	}
	public String getNumber() {
		return number;
	}
	public String getType() {
		return type;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
    
}
