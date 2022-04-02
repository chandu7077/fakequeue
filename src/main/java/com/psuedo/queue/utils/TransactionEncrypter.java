package com.psuedo.queue.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.psuedo.queue.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionEncrypter {

    public String encryptTransaction(Transaction transaction) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = null;
        try {
            json = ow.writeValueAsString(transaction);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return AES.encrypt(json);
    }
}
