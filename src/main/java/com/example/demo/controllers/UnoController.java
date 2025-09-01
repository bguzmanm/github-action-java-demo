package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UnoController {

    @GetMapping
    public String uno() {
        return "{'status': 200, 'message':'llego bien. Todos bien'}";
    }

    @GetMapping("/dos")
    public String dos() {
        return "{'status': 200, 'message':'status ok'}";
    }
}
