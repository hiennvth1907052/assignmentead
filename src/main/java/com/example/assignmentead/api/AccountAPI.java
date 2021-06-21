package com.example.assignmentead.api;

import com.example.assignmentead.entity.Account;
import com.example.assignmentead.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/account")
public class AccountAPI {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Account create(@RequestBody Account account){
        return accountService.saveAll(account);
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> productList(){
        return accountService.getListAccount();
    }
}
