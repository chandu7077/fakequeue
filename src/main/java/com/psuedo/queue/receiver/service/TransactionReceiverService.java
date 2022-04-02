package com.psuedo.queue.receiver.service;

import com.psuedo.queue.model.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface TransactionReceiverService {

    public ResponseEntity<String> receiveTransaction(String encryptedTransaction);
}
