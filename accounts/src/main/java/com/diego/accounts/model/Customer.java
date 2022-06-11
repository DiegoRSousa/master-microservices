package com.diego.accounts.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String number;
    @Email
    @NotNull
    private String email;
    @NotNull
    private String mobileNumber;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Customer(String name, String number, String email, String mobileNumber) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.mobileNumber = mobileNumber;
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

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", createdAt=" + createdAt + "]";
	}
}
