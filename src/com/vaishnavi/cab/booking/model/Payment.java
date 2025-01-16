package com.vaishnavi.cab.booking.model;

import com.vaishnavi.cab.booking.enums.PaymentMethod;

public class Payment {
    private int paymentId;
    private int rideId;
    private int userId;
    private double amount;
    private String paymentMethod;  // E.g., "Credit Card", "Cash"
    private String status;  // E.g., "Paid", "Pending"

    // Constructor, getters, and setters

    public Payment(int paymentId, int rideId, int userId, double amount, PaymentMethod paymentMethod, String status) {
        this.paymentId = paymentId;
        this.rideId = rideId;
        this.userId = userId;
        this.amount = amount;
        this.paymentMethod = String.valueOf(paymentMethod);
        this.status = status;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
