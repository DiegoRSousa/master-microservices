package com.diego.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.accounts.model.Account;

public interface AccountsRepository extends JpaRepository<Account, Long>{

	public Account findByCustomerId(String customerId);
}
