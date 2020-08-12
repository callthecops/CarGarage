package model.vehicles;

import model.Vehicle;

public class MotorBike implements Vehicle {
    @Override
    public void driveIn() {
        System.out.println("Driving MotorBike in the Garage");
    }

    @Override
    public void driveOut() {
        System.out.println("Driving MotorBike out of the Garage");
    }
}
