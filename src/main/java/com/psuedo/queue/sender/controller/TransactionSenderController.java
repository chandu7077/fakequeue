package com.psuedo.queue.sender.controller;

import com.psuedo.queue.model.Transaction;
import com.psuedo.queue.sender.service.TransactionSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction/send")
@CrossOrigin
public class TransactionSenderController {

    @Autowired
    TransactionSenderService transactionSenderService;

    @PostMapping
    public ResponseEntity<String> addTransaction(@RequestBody Transaction transaction) {
        return transactionSenderService.addTransaction(transaction);
    }
}
