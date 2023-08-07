package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Maturity;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Security_Trades;

import java.util.List;

public interface IBondsService {
    public List<Security> getAllSecurity();

    List<Maturity> getAllMaturity();

    public List<Security_Trades> getAllCode();

    public List<Security> getAllIssuer();

    public List<Security> getAllCounterparty();

    public List<Security> getAllBooks();




}

