package com.platzi.market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {

    private Integer purchaseId;
    private String clientId;
    private LocalDateTime dateTime;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> products;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PurchaseItem> getProducts() {
        return products;
    }

    public void setProducts(List<PurchaseItem> products) {
        this.products = products;
    }
}
