package com.example.assignmentead.service;

import com.example.assignmentead.entity.Account;
import com.example.assignmentead.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Account saveAll(Account account){
        account.setPasswordHash(bCryptPasswordEncoder.encode(account.getPasswordHash()));
        return accountRepository.save(account);
    }

    public List<Account> getListAccount(){
        return accountRepository.findAll();
    }
}
