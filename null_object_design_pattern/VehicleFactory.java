package com.software_design.null_design_pattern;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicle) {
        if(vehicle.equals("CAR")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
