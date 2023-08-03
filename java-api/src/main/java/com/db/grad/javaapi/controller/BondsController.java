package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.IBondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BondsController {

    @Autowired
    IBondsService iBondsService;
    @GetMapping("/bonds")
    public List<Security> getAllSecurity() {
        return iBondsService.getAllSecurity();
    }
}

