package com.diego.accounts.controller;

import com.diego.accounts.dto.AccountDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.diego.accounts.model.Account;
import com.diego.accounts.repository.AccountsRepository;

@RestController
@RequestMapping("accounts")
public class AccountsController {
	
	@Autowired
    private AccountsRepository accountsRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger("AccountsController");

    @GetMapping("{customerId}")
    public ResponseEntity<AccountDetail> getAccountDetail(@PathVariable String customerId) {
        LOGGER.info("getting account by customer id: {}", customerId);

    	var account = accountsRepository.findByCustomerId(1L).orElseThrow(
        		() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        LOGGER.info("account found: {}", account);
    	return ResponseEntity.ok(new AccountDetail(account));
        
    }
    
}
