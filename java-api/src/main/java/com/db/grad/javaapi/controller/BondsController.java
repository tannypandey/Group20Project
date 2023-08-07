package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Security_Trades;
import com.db.grad.javaapi.model.Trades_cp_issuer;
import com.db.grad.javaapi.service.IBondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class BondsController {

    @Autowired
    IBondsService iBondsService;
    @GetMapping("/bonds")
    public List<Security> getAllSecurity() {
        return iBondsService.getAllSecurity();
    }

    @GetMapping("/issuer")
    public List<Trades_cp_issuer> getAllIssuer() {
        return iBondsService.getAllIssuer();
    }

    @GetMapping("/counterparty")
    public List<Trades_cp_issuer> getAllCounterparty() {
        return iBondsService.getAllCounterparty();
    }

    @GetMapping("/books")
    public List<Security> getAllBooks() {
        return iBondsService.getAllBooks();
    }

    @GetMapping("/code")
    public List<Security_Trades> getAllCode() {
        return iBondsService.getAllCode();
    }


}

