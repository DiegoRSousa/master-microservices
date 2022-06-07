package com.diego.cards.controller;

import com.diego.cards.dto.CardDetail;
import com.diego.cards.model.Card;
import com.diego.cards.repository.CardsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cards")
public class CardsController {

    private static final Logger LOGGER = LoggerFactory.getLogger("LoansController");
    @Autowired
    private CardsRepository cardsRepository;

    @GetMapping("{customerId}")
    public ResponseEntity<List<CardDetail>> getCardsDetails(@PathVariable Long customerId) {
        LOGGER.info("getting cards by customer id: {}", customerId);
        List<Card> cards = cardsRepository.findByCustomerId(customerId);
        LOGGER.info("cards found: {}", cards);
        return ResponseEntity.ok(cards.stream().map(CardDetail::new).collect(Collectors.toList()));

    }

}
