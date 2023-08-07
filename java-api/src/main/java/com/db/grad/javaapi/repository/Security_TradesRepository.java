package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Security_Trades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Security_TradesRepository extends JpaRepository<Security_Trades, Integer> {
    @Query(nativeQuery = true, value = "select security.id, security.status, trades.trade_type, security.currency, " +
            "security.isin, security.cusip from security join trades on " +
            "security.id = trades.security_id")
    List<Security_Trades> getAllCode();
}
