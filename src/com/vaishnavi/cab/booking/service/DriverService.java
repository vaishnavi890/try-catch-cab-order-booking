package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.enums.CabType;
import com.vaishnavi.cab.booking.repository.DriverRepository;

public class DriverService {
    private final DriverRepository driverRepository = new DriverRepository();

    public void registerDriver(int driverId, String name, String email, String phone, String cabType) {
        try {
            CabType type = CabType.valueOf(cabType.toUpperCase());
            Driver driver = new Driver(driverId, name, email, phone, type);
            driverRepository.addDriver(driver);
            System.out.println("Driver registered with Cab Type: " + driver.getCabType());
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid Cab Type: " + cabType);
        } catch (Exception e) {
            System.err.println("Error in driver registration: " + e.getMessage());
        }
    }
}

