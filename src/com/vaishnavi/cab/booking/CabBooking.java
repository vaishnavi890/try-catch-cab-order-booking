package com.vaishnavi.cab.booking;

import com.vaishnavi.cab.booking.controller.*;

public class CabBooking {
    public static void main(String[] args) {
        // Create Ride using RideController
        RideController rideController = new RideController();
        rideController.createRide(101, 1, 1, "Point A", "Point B", 300.0, "REQUESTED");

        // Process Payment using PaymentController
        PaymentController paymentController = new PaymentController();
        paymentController.makePayment(1, 101, 1, 300.0, "CREDIT_CARD");

        // Register Driver using DriverController
        DriverController driverController = new DriverController();
        driverController.registerDriver(1, "Alice", "alice@example.com", "9876543210", "SEDAN");
    }
}

