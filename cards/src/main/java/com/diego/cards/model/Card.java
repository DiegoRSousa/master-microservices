package com.diego.cards.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Customer customer;
    private String number;
    @Enumerated(EnumType.STRING)
    private CardType type;
    private BigDecimal totalLimit;
    private BigDecimal amountUsed;
    private BigDecimal availableAmount;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getNumber() {
        return number;
    }

    public CardType getType() {
        return type;
    }

    public BigDecimal getTotalLimit() {
        return totalLimit;
    }

    public BigDecimal getAmountUsed() {
        return amountUsed;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", type=" + type +
                ", totalLimit=" + totalLimit +
                ", amountUsed=" + amountUsed +
                ", availableAmount=" + availableAmount +
                ", createdAt=" + createdAt +
                '}';
    }
}
