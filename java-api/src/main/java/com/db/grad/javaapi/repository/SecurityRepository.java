package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Integer>
{

    @Query(nativeQuery = true, value = "select * from security where name = :name")
    List<Security> findByName(Security name);

    @Query(nativeQuery = true, value = "select * from security")
    List<Security> getAllSecurity();

//    @Query(nativeQuery = true, value = "select security.id, security.status, security.type, trades.trade_date, " +
//            "security.maturity_date, trades.trade_settlement_date from security,trades joins trades on " +
//            "security.id = trades.security_id")
//    List<Security> getAllMaturity();
}