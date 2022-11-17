package com.example.simpleBank.controller;

import com.example.simpleBank.model.Account;
import com.example.simpleBank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/")
    @ResponseBody Iterable<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @PostMapping("/add")
    Account addAccount(@RequestBody Account account) {
       return accountRepository.save(account);
    }
}
