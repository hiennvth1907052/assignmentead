package com.example.assignmentead.service;

import com.example.assignmentead.dto.CredentialDTO;
import com.example.assignmentead.entity.Account;
import com.example.assignmentead.entity.Credential;
import com.example.assignmentead.repository.AccountRepository;
import com.example.assignmentead.repository.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredentialService {
    @Autowired
    private CredentialRepository credentialRepository;
    @Autowired
    private AccountRepository accountRepository;

    public Credential createCredential(CredentialDTO credentialDTO){
        Credential credential = new Credential(credentialDTO);
        Account account = new Account();
        account.setUsername(credential.getAccount().getUsername());
        credential.setAccount(account);
        return credentialRepository.save(credential);
    }

    public List<Credential> getList(){
        return credentialRepository.findAll();
    }

}
