package com.psuedo.queue.receiver.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.psuedo.queue.model.Transaction;
import com.psuedo.queue.receiver.dao.TransactionRepository;
import com.psuedo.queue.utils.AES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransactionReceiverServiceImpl implements TransactionReceiverService{

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public ResponseEntity<String> receiveTransaction(String encryptedTransaction) {
            String decryptedTransaction = AES.decrypt(encryptedTransaction);
            ObjectMapper mapper = new ObjectMapper();
        try {
            Transaction transaction = mapper.readValue(decryptedTransaction,Transaction.class);
            transactionRepository.save(transaction);
            return ResponseEntity.ok("Transaction Saved Successfully");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("Application error");
    }
}
