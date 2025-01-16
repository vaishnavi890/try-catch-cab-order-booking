package com.vaishnavi.cab.booking.model;

public class Rating {
    private int ratingId;
    private int rideId;
    private int userId;
    private int driverId;
    private double rating;
    private String review;

    // Constructor, getters, and setters

    public Rating(int ratingId, int rideId, int userId, int driverId, double rating, String review) {
        this.ratingId = ratingId;
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.rating = rating;
        this.review = review;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}

