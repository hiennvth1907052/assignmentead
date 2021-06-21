package com.example.assignmentead.entity;

import com.example.assignmentead.dto.CredentialDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Credential {
    @Id
    private String tokenKey;
    private long createdAt;
    private long expiredAt;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "userId")
    private Account account;
    @Column(insertable = false, updatable = false)
    private int userId;

    public Credential (CredentialDTO credentialDTO) {
        this.tokenKey = UUID.randomUUID().toString();
        this.createdAt = Calendar.getInstance().getTimeInMillis();
        this.expiredAt = Calendar.getInstance().getTimeInMillis();
        this.account = new Account();
        this.userId = credentialDTO.getUserId();
    }
}
