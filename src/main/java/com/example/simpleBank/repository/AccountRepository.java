package com.example.simpleBank.repository;

import com.example.simpleBank.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
