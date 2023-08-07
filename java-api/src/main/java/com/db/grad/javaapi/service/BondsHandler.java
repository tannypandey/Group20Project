package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trades_cp_issuer;
import com.db.grad.javaapi.model.Security_Trades;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.Security_TradesRepository;
import com.db.grad.javaapi.repository.Trades_cp_issuerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BondsHandler implements IBondsService
{
    @Autowired
    private SecurityRepository securityRepo;
    @Autowired
    private Security_TradesRepository security_tradesRepo;
    @Autowired
    private Trades_cp_issuerRepository trades_cp_issuerRepo;



    public BondsHandler( SecurityRepository securityRepo )
    {
        securityRepo = securityRepo;
    }

    @Override
    public List<Security> getAllSecurity()
    {
        return securityRepo.getAllSecurity();
    }

//    @Override
//    public List<Security> getAllMaturity() {
//        return securityRepo.getAllMaturity();
//    }

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
    public List<Security> getAllBooks() {
        return null;
    }

}
