package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.service.DriverService;

public class DriverController {
    private final DriverService driverService = new DriverService();

    public void registerDriver(int driverId, String name, String email, String phone, String cabType) {
        driverService.registerDriver(driverId, name, email, phone, cabType);
    }
}

