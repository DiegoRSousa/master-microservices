package com.diego.accounts.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.diego.accounts.model.Customer;
import com.diego.accounts.validator.UniqueValue;


public class CustomerRequest {
	
	@NotBlank
    private String name;
	@NotBlank
    private String number;
    @Email
    @NotNull
    @UniqueValue(domainClass = Customer.class, fieldName = "email")
    private String email;
    @NotNull
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

	public boolean mobileNumberIsNotValid() {
		return email.isBlank() && mobileNumber.isBlank();
		
	}
	
}
