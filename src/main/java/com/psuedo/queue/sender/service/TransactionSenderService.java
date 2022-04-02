package com.psuedo.queue.sender.service;

import com.psuedo.queue.model.Transaction;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TransactionSenderService {
    public ResponseEntity<String> addTransaction(Transaction transaction);
}
