package com.example.databaseservice.entity;

import com.example.databaseservice.domain.AccountCurrency;
import com.example.databaseservice.domain.BankTransactionStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String transactionId;

    @Column(nullable = false)
    private int accountId;

    @Column(nullable = false)
    private int destinationAccountId;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    AccountCurrency currency;

    @Column(nullable = false)
    private String transactionType;

    @Column(nullable = false)
    private BankTransactionStatus status;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
