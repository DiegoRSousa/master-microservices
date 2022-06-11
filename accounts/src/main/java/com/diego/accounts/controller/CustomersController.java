package com.diego.accounts.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.accounts.dto.CustomerRequest;
import com.diego.accounts.dto.CustomerResponse;
import com.diego.accounts.model.Customer;
import com.diego.accounts.repository.CustomerRepository;


@RestController
@RequestMapping("customers")
public class CustomersController {
	
	private CustomerRepository customerRepository;
	private static final Logger log = LoggerFactory.getLogger("CustomersController");
	
	
	public CustomersController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@PostMapping
	public ResponseEntity<CustomerResponse> save(@Valid @RequestBody CustomerRequest request) {
		
		if(request.getEmail().isBlank() && request.getMobileNumber().isBlank())
			throw new IllegalStateException("The mobile number is Mandatory!");
		
		Customer customer = request.toModel();
		log.info("saving customer: {}", customer);
		customerRepository.save(customer);
		return new ResponseEntity<>(new CustomerResponse(customer), HttpStatus.CREATED);
	}

}
