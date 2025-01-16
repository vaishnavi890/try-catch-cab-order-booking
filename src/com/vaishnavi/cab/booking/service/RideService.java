package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.repository.RideRepository;
import com.vaishnavi.cab.booking.enums.RideStatus;

public class RideService {
private final RideRepository rideRepository = new RideRepository();

public void createRide(int rideId, int userId, int driverId, String pickupLocation, String dropoffLocation, double fare, String status) {
    try {
        RideStatus rideStatus = RideStatus.valueOf(status.toUpperCase());
        Ride ride = new Ride(rideId, userId, driverId, pickupLocation, dropoffLocation, fare, rideStatus);
        rideRepository.addRide(ride);
        System.out.println("Ride created with status: " + ride.getStatus());
    } catch (IllegalArgumentException e) {
        System.err.println("Invalid Ride Status: " + status);
    } catch (Exception e) {
        System.err.println("Error in creating ride: " + e.getMessage());
    }
}
}

