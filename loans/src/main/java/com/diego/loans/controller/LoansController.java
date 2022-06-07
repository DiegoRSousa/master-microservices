package com.diego.loans.controller;


import com.diego.loans.dto.LoanDetail;
import com.diego.loans.model.Loan;
import com.diego.loans.repository.LoansRepository;
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
@RequestMapping("loans")
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger("LoansController");

    @GetMapping("{customerId}")
    public ResponseEntity<?> getLoansDetails(@PathVariable Long customerId) {
        LOGGER.info("getting loans by customer id: {}", customerId);
        List<Loan> loans = loansRepository.findByCustomerIdOrderByStartDateDesc(customerId);
        LOGGER.info("loans found: {}", loans);
        return ResponseEntity.ok(loans.stream().map(LoanDetail::new).collect(Collectors.toList()));
    }
}
