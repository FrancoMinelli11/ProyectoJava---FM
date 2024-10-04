package edu.francol11.proyecto_java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    public Invoice () {}

    public Invoice(int id, int clientId, String createdAt, double total) {
        this.id = id;
        this.clientId = clientId;
        this.createdAt = createdAt;
        this.total = total;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "CLIENT_ID")
    private int clientId;
    @Column(name = "CREATED_AT")
    private String createdAt;
    @Column(name = "TOTAL")
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
