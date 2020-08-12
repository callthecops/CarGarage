package model.vehicles;

import model.Vehicle;

public class Scooter implements Vehicle {

    @Override
    public void driveIn() {
        System.out.println("Driving Scooter in the garage");
    }

    @Override
    public void driveOut() {
        System.out.println("Driving Scooter out of the garage");
    }
}
