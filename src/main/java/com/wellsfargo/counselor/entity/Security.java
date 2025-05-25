package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private LocalTime purchaseTime;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(String securityName, String category, LocalDate purchaseDate, LocalTime purchaseTime , int quantity) {
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }

    public String getSecurityName() { return securityName; }

    public void setSecurityName(String securityName) { this.securityName = securityName; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public LocalDate getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }

    public LocalTime getPurchaseTime() { return purchaseTime; }

    public void setPurchaseTime(LocalTime purchaseTime) { this.purchaseTime = purchaseTime; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Portfolio getPortfolio() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

}