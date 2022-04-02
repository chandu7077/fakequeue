package com.psuedo.queue.sender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class FakeQueueService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${transaction.receiver.url}")
    private String receiverURL;

    public ResponseEntity<String> addToQueue(String encryptedTransaction) {
        return ResponseEntity.ok(callReceiverAPI(encryptedTransaction));
    }

    private String callReceiverAPI(String encryptedTransaction) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(encryptedTransaction,headers);
        return restTemplate.exchange(
                receiverURL, HttpMethod.POST, entity, String.class).getBody();
    }
}
