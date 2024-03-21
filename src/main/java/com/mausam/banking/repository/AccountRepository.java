package com.mausam.banking.repository;

import com.mausam.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

// AccountRepository will allow us to perform CRUD operations on Account class
