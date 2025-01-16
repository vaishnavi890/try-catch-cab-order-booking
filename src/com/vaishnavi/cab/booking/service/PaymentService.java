package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.enums.PaymentMethod;
import com.vaishnavi.cab.booking.repository.PaymentRepository;

public class PaymentService {
    private final PaymentRepository paymentRepository = new PaymentRepository();

    public void processPayment(int paymentId, int rideId, int userId, double amount, String method) {
        try {
            PaymentMethod paymentMethod = PaymentMethod.valueOf(method.toUpperCase());
            Payment payment = new Payment(paymentId, rideId, userId, amount, paymentMethod, "SUCCESS");
            paymentRepository.addPayment(payment);
            System.out.println("Payment processed using: " + payment.getPaymentMethod());
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid Payment Method: " + method);
        } catch (Exception e) {
            System.err.println("Error in processing payment: " + e.getMessage());
        }
    }
}

