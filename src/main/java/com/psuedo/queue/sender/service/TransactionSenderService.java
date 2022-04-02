package com.psuedo.queue.sender.service;

import com.psuedo.queue.model.Transaction;
import org.springframework.http.ResponseEntity;

public interface TransactionSenderService {
    public ResponseEntity<String> addTransaction(Transaction transaction);
}
