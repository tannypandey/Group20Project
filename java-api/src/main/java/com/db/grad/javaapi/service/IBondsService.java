package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IBondsService
{
    public List<Security> getAllSecurity();

//    public Security addDog(Security theSecurity);
//
//    public long getNoOfSecurity();
//
//    public boolean removeSecurity(int uniqueId);
//
//    public Security getSecurityById(int uniqueId);
//
//    public Security getSecurityByName(String securityName );
//
//    public Security updateDogDetails(Security SecurityToUpdate);
}
