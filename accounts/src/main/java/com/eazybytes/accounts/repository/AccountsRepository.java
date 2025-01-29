package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
