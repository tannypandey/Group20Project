package com.db.grad.javaapi.service;
import com.db.grad.javaapi.model.Maturity;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Security_Book;

import com.db.grad.javaapi.model.Trades_cp_issuer;

import com.db.grad.javaapi.model.Security_Trades;
import com.db.grad.javaapi.repository.Maturity_Repository;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.Security_BookRepository;
import com.db.grad.javaapi.repository.Security_TradesRepository;
import com.db.grad.javaapi.repository.Trades_cp_issuerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BondsHandler implements IBondsService
{
    @Autowired
    private SecurityRepository securityRepo;
    @Autowired
    private Security_TradesRepository security_tradesRepo;
    @Autowired
    private Maturity_Repository maturityRepo;
    @Autowired
    private Trades_cp_issuerRepository trades_cp_issuerRepo;

    @Autowired
    private Security_BookRepository security_bookRepo;

    public BondsHandler( SecurityRepository securityRepo )
    {
        securityRepo = securityRepo;
    }

    @Override
    public List<Security> getAllSecurity()
    {
        return securityRepo.getAllSecurity();
    }

    @Override
    public List<Maturity> getAllMaturity() {
        return maturityRepo.getAllMaturity();
    }

    @Override
    public List<Security_Trades> getAllCode() {
        return security_tradesRepo.getAllCode();
    }

    @Override
    public List<Trades_cp_issuer> getAllIssuer() {
        return trades_cp_issuerRepo.getAllIssuer();
    }

    @Override
    public List<Trades_cp_issuer> getAllCounterparty(){
            return trades_cp_issuerRepo.getAllCounterparty();
    }

    @Override
    public List<Security_Book> getAllBooks() {
        return security_bookRepo.getAllBooks();
    }

    @Override
    public List<Security_Book> findByBookName(String book_name){
        String query_name = book_name + "%";
        return security_bookRepo.findByBookName(query_name);
    }

}
