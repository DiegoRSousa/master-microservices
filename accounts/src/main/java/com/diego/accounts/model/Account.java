package com.diego.accounts.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private Customer customer;
    private String number;
    private String type;
    private LocalDate createdAt = LocalDate.now();
    
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
