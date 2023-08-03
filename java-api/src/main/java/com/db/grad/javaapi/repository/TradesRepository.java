package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Trades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradesRepository extends JpaRepository<Trades, Integer>
{

}