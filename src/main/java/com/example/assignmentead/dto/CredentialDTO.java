package com.example.assignmentead.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CredentialDTO {
    private String tokenKey;
    private long createdAt;
    private long expiredAt;
    private String username;
    private int userId;

    public CredentialDTO(String tokenKey, long createdAt, long expiredAt, String username, int userId) {
        this.tokenKey = tokenKey;
        this.createdAt = createdAt;
        this.expiredAt = expiredAt;
        this.username = username;
        this.userId = userId;
    }
}
