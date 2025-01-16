package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Payment;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepository {
    private final List<Payment> paymentList = new ArrayList<>();

    public void addPayment(Payment payment) {
        try {
            paymentList.add(payment);
            System.out.println("Payment added successfully for Ride ID: " + payment.getRideId());
        } catch (Exception e) {
            System.err.println("Error while adding payment: " + e.getMessage());
        }
    }

    public List<Payment> getAllPayments() {
        return paymentList;
    }
}

