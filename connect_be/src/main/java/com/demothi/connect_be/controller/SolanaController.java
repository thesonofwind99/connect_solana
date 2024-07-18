package com.demothi.connect_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/solana")
public class SolanaController {
    @Autowired
    private SolanaService solanaService;

    @GetMapping("/balance/{address}")
    public ResponseEntity<String> getBalance(@PathVariable String address) {
        String balance = solanaService.getBalance(address);
        return ResponseEntity.ok(balance);
    }
}

