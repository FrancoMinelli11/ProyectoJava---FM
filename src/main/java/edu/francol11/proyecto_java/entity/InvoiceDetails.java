package edu.francol11.proyecto_java.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "INVOICE_DETAILS")

public class InvoiceDetails {
    public InvoiceDetails () {}

    public InvoiceDetails(int invoiceId, int invoiceDetailId, int amount, int productId, double price) {
        this.invoiceId = invoiceId;
        this.invoiceDetailId = invoiceDetailId;
        this.amount = amount;
        this.productId = productId;
        this.price = price;
    }

    @Id
    @Column(name = "INVOICE_ID")
    private int invoiceId;
    @Column(name = "INVOICE_DETAIL_ID")
    private int invoiceDetailId;
    @Column(name = "AMOUNT")
    private int amount;
    @Column(name = "PRODUCT_ID")
    private int productId;
    @Column(name = "PRICE")
    private double price;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getInvoiceDetailId() {
        return invoiceDetailId;
    }

    public void setInvoiceDetailId(int invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
