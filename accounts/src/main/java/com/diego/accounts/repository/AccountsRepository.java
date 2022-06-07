package com.diego.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.accounts.model.Account;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Account, Long>{

	public Optional<Account> findByCustomerId(Long customerId);
}
