package com.db.grad.javaapi.model;
import javax.persistence.*;
@Entity
@Table(name = "security")
@SecondaryTable(name = "trades", pkJoinColumns = @PrimaryKeyJoinColumn(name = "security_id"))
public class Security_Trades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    private String trade_type;
    private String currency;
    private String isin;
    private String cusip;
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
    @Column(name = "currency",table="security", nullable = false)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    @Column(name = "isin",table="security", nullable = true)
    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }
    @Column(name = "cusip",table="security", nullable = true)
    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    @Override
    public String toString() {
        return "Security_Trades{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", trade_type='" + trade_type + '\'' +
                ", currency='" + currency + '\'' +
                ", isin='" + isin + '\'' +
                ", cusip='" + cusip + '\'' +
                '}';
    }
}
