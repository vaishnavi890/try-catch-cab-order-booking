package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.service.RideService;

public class RideController {
    private final RideService rideService = new RideService();

    public void createRide(int rideId, int userId, int driverId, String pickupLocation, String dropoffLocation, double fare, String status) {
        rideService.createRide(rideId, userId, driverId, pickupLocation, dropoffLocation, fare, status);
    }
}

