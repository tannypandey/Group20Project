package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name="security")
@SecondaryTable(name = "book", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
public class Security_Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    private String type;
    private String currency;
    private String cusip;
    private String book_name;

    @Id
    @Column(name = "id", table= "security", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "cusip", table= "security", nullable = true)
    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }


    @Column(name = "type", table= "security", nullable = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "currency", table= "security", nullable = false)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Column(name = "status", table= "security", nullable = true)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "name", table = "book", nullable = false)
    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
}
