package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Maturity;
import com.db.grad.javaapi.model.Security_Trades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Maturity_Repository extends JpaRepository<Maturity, Integer> {
    @Query(nativeQuery = true, value = "select security.id, security.status, trades.trade_type, trades.trade_date, " +
            "security.maturity_date, trades.trade_settlement_date from security join trades on " +
            "security.id = trades.security_id")
    List<Maturity> getAllMaturity();
}
