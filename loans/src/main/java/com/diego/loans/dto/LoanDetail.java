package com.diego.loans.dto;

import com.diego.loans.model.Customer;
import com.diego.loans.model.Loan;
import com.diego.loans.model.LoanType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoanDetail {

    private Long id;
    private String customerName;
    private String customerNumber;
    private LocalDate startDate;
    private LoanType type;
    private BigDecimal total;
    private BigDecimal amountPaid;
    private LocalDateTime createdAt;

    public LoanDetail() {}
    public LoanDetail(Loan loan) {
        this.id = loan.getId();
        this.customerName = loan.getCustomer().getName();
        this.customerNumber = loan.getCustomer().getNumber();
        this.startDate = loan.getStartDate();
        this.type = loan.getType();
        this.total = loan.getTotal();
        this.amountPaid = loan.getAmountPaid();
        this.createdAt = loan.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LoanType getType() {
        return type;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
