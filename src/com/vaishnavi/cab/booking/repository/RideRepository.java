package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Ride;
import java.util.ArrayList;
import java.util.List;

public class RideRepository {
        private final List<Ride> rideList = new ArrayList<>();

        public void addRide(Ride ride) {
            try {
                rideList.add(ride);
                System.out.println("Ride added successfully: " + ride.getPickupLocation() + " to " + ride.getDropoffLocation());
            } catch (Exception e) {
                System.err.println("Error while adding ride: " + e.getMessage());
            }
        }

        public List<Ride> getAllRides() {
            return rideList;
        }
    }

