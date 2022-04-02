package com.psuedo.queue.receiver.service;

import com.psuedo.queue.model.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TransactionReceiverService {

    public ResponseEntity<String> receiveTransaction(String encryptedTransaction);
    public List<Transaction> fetchAllTransactions();
}
