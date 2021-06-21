package com.example.assignmentead.api;

import com.example.assignmentead.dto.CredentialDTO;
import com.example.assignmentead.entity.Credential;
import com.example.assignmentead.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/credential")
public class CredentialAPI {
    @Autowired
    private CredentialService credentialService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Credential create(@RequestBody CredentialDTO credentialDTO){
        return credentialService.createCredential(credentialDTO);
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Credential> productList(){
        return credentialService.getList();
    }
}
