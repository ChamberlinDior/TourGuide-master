package com.openclassrooms.tourguide.model;



public class NearbyAttraction {
    // Name of Tourist attraction,
    private String name;
    // Tourist attractions lat/long,
    private double attractionLatitude;
    private double attractionLongitude;

    // The user's location lat/long,
    private double userLatitude;
    private double userLongitude;
    // The distance in miles between the user's location and each of the attractions.
    private double distance;
    // The reward points for visiting each Attraction.
    private int rewards;

    public NearbyAttraction(String name,
                            double attractionLatitude,
                            double attractionLongitude,
                            double userLatitude,
                            double userLongitude,
                            double distance,
                            int rewards) {
        this.name = name;
        this.attractionLatitude = attractionLatitude;
        this.attractionLongitude = attractionLongitude;
        this.userLatitude = userLatitude;
        this.userLongitude = userLongitude;
        this.distance = distance;
        this.rewards = rewards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttractionLatitude() {
        return attractionLatitude;
    }

    public void setAttractionLatitude(double attractionLatitude) {
        this.attractionLatitude = attractionLatitude;
    }

    public double getAttractionLongitude() {
        return attractionLongitude;
    }

    public void setAttractionLongitude(double attractionLongitude) {
        this.attractionLongitude = attractionLongitude;
    }

    public double getUserLatitude() {
        return userLatitude;
    }

    public void setUserLatitude(double userLatitude) {
        this.userLatitude = userLatitude;
    }

    public double getUserLongitude() {
        return userLongitude;
    }

    public void setUserLongitude(double userLongitude) {
        this.userLongitude = userLongitude;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getRewards() {
        return rewards;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }
}
