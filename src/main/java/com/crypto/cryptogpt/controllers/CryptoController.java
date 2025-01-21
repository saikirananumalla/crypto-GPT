package com.crypto.cryptogpt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
