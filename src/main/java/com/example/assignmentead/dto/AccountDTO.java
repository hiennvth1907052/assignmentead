package com.example.assignmentead.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountDTO {
    private String username;
    private String fullName;
    private String passwordHash;
    private int role;
    private int status;

    public AccountDTO(String username, String fullName, String passwordHash, int role, int status) {
        this.username = username;
        this.fullName = fullName;
        this.passwordHash = passwordHash;
        this.role = role;
        this.status = status;
    }
}
