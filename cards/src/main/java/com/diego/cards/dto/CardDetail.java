package com.diego.cards.dto;

import com.diego.cards.model.Card;
import com.diego.cards.model.CardType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CardDetail {

    private Long id;
    private String customerName;
    private String customerNumber;
    private String number;
    private CardType type;
    private BigDecimal totalLimit;
    private BigDecimal amountUsed;
    private BigDecimal availableAmount;
    private LocalDateTime createdAt;

    public CardDetail() { }
    public CardDetail(Card card) {
        this.id = card.getId();
        this.customerName = card.getCustomer().getName();
        this.customerNumber = card.getCustomer().getNumber();
        this.number = card.getNumber();
        this.type = card.getType();
        this.totalLimit = card.getTotalLimit();
        this.amountUsed = card.getAmountUsed();
        this.availableAmount = card.getAvailableAmount();
        this.createdAt = card.getCreatedAt();
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
}
