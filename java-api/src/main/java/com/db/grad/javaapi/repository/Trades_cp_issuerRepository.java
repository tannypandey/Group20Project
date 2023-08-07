package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Security_Trades;
import com.db.grad.javaapi.model.Trades_cp_issuer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Trades_cp_issuerRepository extends JpaRepository<Trades_cp_issuer, Integer> {
    @Query(nativeQuery = true, value = "select trades.id, trades.status, trades.trade_type, counterparty.name, trades.bond_holder from trades join counterparty on counterparty.id = trades.counterparty_id")
    List<Trades_cp_issuer> getAllIssuer();
    @Query(nativeQuery = true, value = "select trades.id, trades.status, trades.trade_type, counterparty.name, trades.bond_holder from trades join counterparty on counterparty.id = trades.counterparty_id")
    List<Trades_cp_issuer> getAllCounterparty();

}
