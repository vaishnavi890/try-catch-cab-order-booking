package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.service.PaymentService;

public class PaymentController {
    private final PaymentService paymentService = new PaymentService();

    public void makePayment(int paymentId, int rideId, int userId, double amount, String method) {
        paymentService.processPayment(paymentId, rideId, userId, amount, method);
    }
}

