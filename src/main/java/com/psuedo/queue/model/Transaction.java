package com.psuedo.queue.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class Transaction {


    @Id
    @JsonIgnore
    @GeneratedValue
    public Long transactionId;

    @Column(name = "account_number")
    @JsonProperty("Account Number")
    private String accountNumber;

    @Column(name = "type")
    @JsonProperty("Type")
    private String type;

    @Column(name = "amount")
    @JsonProperty("Amount")
    private String amount;

    @Column(name = "currency")
    @JsonProperty("Currency")
    private String currency;

    @Column(name = "account_from")
    @JsonProperty("AccountFrom")
    private String accountFrom;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}
