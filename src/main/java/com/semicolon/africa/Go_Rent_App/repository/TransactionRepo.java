package com.semicolon.africa.Go_Rent_App.repository;

import com.semicolon.africa.Go_Rent_App.models.RenterTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalTransactionRepo extends JpaRepository<RenterTransaction, Long> {
}
