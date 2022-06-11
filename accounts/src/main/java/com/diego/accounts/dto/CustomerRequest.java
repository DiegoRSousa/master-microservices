package com.diego.accounts.dto;

import com.diego.accounts.model.Customer;

public class CustomerRequest {
	
    private String name;
    private String number;
    private String email;
    private String mobileNumber;

	public CustomerRequest(String name, String number, String email, String mobileNumber) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public Customer toModel() {
		return new Customer(name, number, email, mobileNumber);
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
	
}
