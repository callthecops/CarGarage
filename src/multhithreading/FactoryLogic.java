package multhithreading;

import model.Garage;
import model.Vehicle;
import model.twoWheeler.tires.MotorBikeTire;
import model.twoWheeler.tires.ScooterTire;
import model.vehicles.MotorBike;
import model.vehicles.Scooter;

import java.util.List;

public class FactoryLogic<T> {

    public void vehicleIsMotorBike(Vehicle vehicle, Garage<T> garage) throws InterruptedException {

        MotorBike motorBike = (MotorBike) vehicle;
        System.out.println("Retrieving MotorBike Tires");
        Thread.sleep(1500);
        System.out.println("Please Wait..");
        List<? super T> tireList = garage.gettTwoWheelerSpace().getTwoWheelerRack().getTireList();
        MotorBikeTire motorBikeTire = null;

        for (Object tire : tireList) {
            if (tire instanceof MotorBikeTire) {
                motorBikeTire = (MotorBikeTire) tire;
            }
        }
        System.out.println("|Changing tires of the motorbike to: " + motorBikeTire.getBrand() +
                "|Description: " + motorBikeTire.getDescription());

        Thread.sleep(2000);
        System.out.println("Done");
        motorBike.setMotorBikeTire(motorBikeTire);


    }

    public void vehicleIsScooter(Vehicle vehicle, Garage<T> garage) throws InterruptedException {

        Scooter scooter = (Scooter) vehicle;
        System.out.println("Retrieving Scooter Tires");
        Thread.sleep(1500);
        System.out.println("Please Wait..");
        List<? super T> tireList = garage.gettTwoWheelerSpace().getTwoWheelerRack().getTireList();
        ScooterTire scooterTire = null;

        for (Object tire : tireList) {
            if (tire instanceof ScooterTire) {
                scooterTire = (ScooterTire) tire;
            }
        }
        System.out.println("|Changing tires of the scooter to: " + scooterTire.getBrand() +
                "|Description: " + scooterTire.getDescription());

        Thread.sleep(2000);
        System.out.println("Done");
        scooter.setScooterTire(scooterTire);
    }


}
