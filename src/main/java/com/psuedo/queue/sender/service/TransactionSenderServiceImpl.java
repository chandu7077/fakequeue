package com.psuedo.queue.sender.service;

import com.psuedo.queue.model.Transaction;
import com.psuedo.queue.sender.utils.TransactionEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransactionSenderServiceImpl implements TransactionSenderService{

    @Autowired
    TransactionEncrypter transactionEncrypter;

    @Override
    public ResponseEntity<String> addTransaction(Transaction transaction) {
        String encryptedValue = transactionEncrypter.encryptTransaction(transaction);
        return ResponseEntity.ok(encryptedValue);
    }
}
