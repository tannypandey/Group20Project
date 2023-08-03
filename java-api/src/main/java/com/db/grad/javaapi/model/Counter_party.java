package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "trades")
public class Counter_party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Counter_party{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
