package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "counterparty")
@SecondaryTable(name = "trades", pkJoinColumns = @PrimaryKeyJoinColumn(name = "counterparty_id"))

public class Trades_cp_issuer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String status;
    private String trade_type;
    private String issuer;
    private String bond_holder;


    @Id
    @Column(name = "id",table="counterparty", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "status",table="trades", nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Column(name = "trade_type",table="trades", nullable = false)
    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    @Column(name = "name", table="counterparty", nullable = false)
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Column(name = "bond_holder", table="trades", nullable = false)
    public String getBond_holder() {
        return bond_holder;
    }

    public void setBond_holder(String bond_holder) {
        this.bond_holder = bond_holder;
    }

    @Override
    public String toString() {
        return "Trades_cp_issuer{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", trade_type='" + trade_type + '\'' +
                ", issuer='" + issuer + '\'' +
                ", bond_holder='" + bond_holder + '\'' +
                '}';
    }
}
