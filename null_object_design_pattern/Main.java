package com.software_design.null_design_pattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("BIKE");

        System.out.println("seating capacity " + vehicle.getSeatingCapacity());
        System.out.println("tank capacity " + vehicle.getTankCapacity());
    }
}
