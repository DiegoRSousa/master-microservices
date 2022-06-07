package com.diego.loans.repository;

import com.diego.loans.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoansRepository  extends JpaRepository<Loan, Long> {

    List<Loan> findByCustomerIdOrderByStartDateDesc(Long customerId);

}
