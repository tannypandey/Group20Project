package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IBondsService {
    public List<Security> getAllSecurity();
}

