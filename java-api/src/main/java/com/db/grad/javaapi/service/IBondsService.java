package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Security_Trades;
import com.db.grad.javaapi.model.Trades_cp_issuer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IBondsService {
    public List<Security> getAllSecurity();

//    public List<Security> getAllMaturity();

    public List<Security_Trades> getAllCode();

    public List<Trades_cp_issuer> getAllIssuer();

    public List<Trades_cp_issuer> getAllCounterparty();

    public List<Security> getAllBooks();


}

