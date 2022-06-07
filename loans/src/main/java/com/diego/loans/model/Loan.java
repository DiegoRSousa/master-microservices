package com.diego.loans.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Customer customer;
    private LocalDate startDate;
    @Enumerated(EnumType.STRING)
    private LoanType type;
    private BigDecimal total;
    private BigDecimal amountPaid;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
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

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", customer=" + customer +
                ", startDate=" + startDate +
                ", type=" + type +
                ", total=" + total +
                ", amountPaid=" + amountPaid +
                ", createdAt=" + createdAt +
                '}';
    }
}
