package com.psuedo.queue.receiver.controller;

import com.psuedo.queue.model.Transaction;
import com.psuedo.queue.receiver.service.TransactionReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/transaction/receive")
public class TransactionReceiverController {

    @Autowired
    TransactionReceiverService transactionReceiverService;

    @PostMapping
    public ResponseEntity<String> receiveTransaction(@RequestBody String encryptedTransaction) {
        return transactionReceiverService.receiveTransaction(encryptedTransaction);
    }

    @GetMapping
    public List<Transaction> fetchAllTransactions(@RequestBody Transaction transaction) {
        return transactionReceiverService.fetchAllTransactions();
    }
}
