package com.psuedo.queue.sender.service;

import com.psuedo.queue.model.Transaction;
import com.psuedo.queue.utils.TransactionEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransactionSenderServiceImpl implements TransactionSenderService{

    @Autowired
    TransactionEncrypter transactionEncrypter;

    @Autowired
    FakeQueueService fakeQueueService;

    @Override
    public ResponseEntity<String> addTransaction(Transaction transaction) {
        String encryptedValue = transactionEncrypter.encryptTransaction(transaction);
        return fakeQueueService.addToQueue(encryptedValue);
    }
}
