package com.diego.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.diego.accounts.model.Account;
import com.diego.accounts.repository.AccountsRepository;

@RestController
@RequestMapping("accounts")
public class AccountsController {
	
	@Autowired
    private AccountsRepository accountsRepository;

    @GetMapping
    public ResponseEntity<Account> getAccountDetail(@RequestParam Long id) {
    	var account = accountsRepository.findById(id).orElseThrow(
        		() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    	return ResponseEntity.ok(new AccountDetail(account));
        
    }
    
}
