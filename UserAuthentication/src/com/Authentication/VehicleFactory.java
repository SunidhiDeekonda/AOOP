package com.Authentication;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            case "Scooter":
                return new Scooter();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
