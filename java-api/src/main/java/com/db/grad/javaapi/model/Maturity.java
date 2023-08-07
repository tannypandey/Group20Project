package com.db.grad.javaapi.model;
import javax.persistence.*;
@Entity
@Table(name = "security")
@SecondaryTable(name = "trades", pkJoinColumns = @PrimaryKeyJoinColumn(name = "security_id"))
public class Maturity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    private String trade_type;
    private String trade_date;
    private String maturity_date;
    private String trade_settlement_date;
    @Id
    @Column(name = "id",table="security", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "status",table="security", nullable = true)
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
    @Column(name = "trade_date",table="trades", nullable = false)
    public String getTrade_date() {
        return trade_date;
    }

    public void setTrade_date(String trade_date) {
        this.trade_date = trade_date;
    }
    @Column(name = "maturity_date",table="security", nullable = false)
    public String getMaturity_date() {
        return maturity_date;
    }

    public void setMaturity_date(String maturity_date) {
        this.maturity_date = maturity_date;
    }
    @Column(name = "trade_settlement_date",table="trades", nullable = false)
    public String getTrade_settlement_date() {
        return trade_settlement_date;
    }

    public void setTrade_settlement_date(String trade_settlement_date) {
        this.trade_settlement_date = trade_settlement_date;
    }

    @Override
    public String toString() {
        return "Maturity{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", trade_type='" + trade_type + '\'' +
                ", trade_date='" + trade_date + '\'' +
                ", maturity_date='" + maturity_date + '\'' +
                ", trade_settlement_date='" + trade_settlement_date + '\'' +
                '}';
    }
}
