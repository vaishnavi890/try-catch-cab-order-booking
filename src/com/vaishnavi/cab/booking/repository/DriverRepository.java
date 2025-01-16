package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Driver;
import java.util.ArrayList;
import java.util.List;

public class DriverRepository {
    private final List<Driver> driverList = new ArrayList<>();

    public void addDriver(Driver driver) {
        try {
            driverList.add(driver);
            System.out.println("Driver added successfully: " + driver.getName());
        } catch (Exception e) {
            System.err.println("Error while adding driver: " + e.getMessage());
        }
    }

    public List<Driver> getAllDrivers() {
        return driverList;
    }
}

