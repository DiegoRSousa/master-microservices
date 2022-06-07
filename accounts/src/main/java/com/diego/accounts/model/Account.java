package com.diego.accounts.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@OneToOne
	private Customer customer;
    private String number;
	@Enumerated(EnumType.STRING)
    private AccountType type;
    private LocalDateTime createdAt = LocalDateTime.now();
    
	public Long getId() {
		return id;
	}
	public String getNumber() {
		return number;
	}
	public Customer getCustomer() {
		return customer;
	}
	public AccountType getType() {
		return type;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", customer=" + customer +
				", number='" + number + '\'' +
				", type=" + type +
				", createdAt=" + createdAt +
				'}';
	}
}