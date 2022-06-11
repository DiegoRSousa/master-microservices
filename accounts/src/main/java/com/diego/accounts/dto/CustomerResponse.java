package com.diego.accounts.dto;

import java.time.LocalDateTime;

import com.diego.accounts.model.Customer;

public class CustomerResponse {
	
	private Long id;
    private String name;
    private String number;
    private String email;
    private String mobileNumber;
    private LocalDateTime createdAt;
    
    public CustomerResponse() {}
    
    public CustomerResponse(Customer customer) {
    	this.id = customer.getId();
    	this.name = customer.getName();
    	this.number = customer.getNumber();
    	this.email = customer.getEmail();
    	this.mobileNumber = customer.getMobileNumber();
    	this.createdAt = customer.getCreatedAt();
    }

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getEmail() {
		return email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
}
