package com.diego.cards.repository;

import com.diego.cards.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepository extends JpaRepository<Card, Long> {
    List<Card> findByCustomerId(Long customerId);
}
