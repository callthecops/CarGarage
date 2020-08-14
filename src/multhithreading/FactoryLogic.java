package multhithreading;

import model.Garage;
import model.Vehicle;
import model.fourWheeler.tires.CarTire;
import model.fourWheeler.tires.VanTire;
import model.twoWheeler.tires.MotorBikeTire;
import model.twoWheeler.tires.ScooterTire;
import model.vehicles.Car;
import model.vehicles.MotorBike;
import model.vehicles.Scooter;
import model.vehicles.Van;

import java.util.List;

public class FactoryLogic<T, R> {

    public void vehicleIsMotorBike(Vehicle vehicle, Garage<T, R> garage) throws InterruptedException {

        MotorBike motorBike = (MotorBike) vehicle;
        System.out.println("Retrieving MotorBike Tires");
        Thread.sleep(1500);
        System.out.println("Please Wait..");
        List<? super T> tireList = garage.getTwoWheelerSpace().getTwoWheelerRack().getTireList();


        MotorBikeTire motorBikeTire = tireList.stream()
                .filter(tire -> tire instanceof MotorBikeTire)
                .map(MotorBikeTire.class::cast)
                .findAny()
                .orElse(null);

        System.out.println("|Changing tires of the motorbike to: " + motorBikeTire.getBrand() +
                "|Description: " + motorBikeTire.getDescription());

        Thread.sleep(2000);
        System.out.println("Done");
        motorBike.setMotorBikeTire(motorBikeTire);


    }

    public void vehicleIsScooter(Vehicle vehicle, Garage<T, R> garage) throws InterruptedException {

        Scooter scooter = (Scooter) vehicle;
        System.out.println("Retrieving Scooter Tires");
        Thread.sleep(1500);
        System.out.println("Please Wait..");
        List<? super T> tireList = garage.getTwoWheelerSpace().getTwoWheelerRack().getTireList();

        ScooterTire scooterTire = tireList.stream()
                .filter(tire -> tire instanceof ScooterTire)
                .map(ScooterTire.class::cast)
                .findAny()
                .orElse(null);

        System.out.println("|Changing tires of the scooter to: " + scooterTire.getBrand() +
                "|Description: " + scooterTire.getDescription());

        Thread.sleep(2000);
        System.out.println("Done");
        scooter.setScooterTire(scooterTire);
    }

    public void vehicleIsCar(Vehicle vehicle, Garage<T, R> garage) throws InterruptedException {

        Car car = (Car) vehicle;
        System.out.println("Retrieving Car Tires");
        Thread.sleep(1500);
        System.out.println("Please Wait..");
        List<? super R> tireList = garage.getFourWheelerSpace().getFourWheelerRack().getTireList();


        CarTire carTire = tireList.stream()
                .filter(tire -> tire instanceof CarTire)
                .map(CarTire.class::cast)
                .findAny()
                .orElse(null);

        System.out.println("|Changing tires of the car to: " + carTire.getBrand() +
                "|Description: " + carTire.getDescription());

        Thread.sleep(2000);
        System.out.println("Done");
        car.setCarTire(carTire);
    }

    public void vehicleIsVan(Vehicle vehicle, Garage<T, R> garage) throws InterruptedException {

        Van van = (Van) vehicle;
        System.out.println("Retrieving Van Tires");
        Thread.sleep(1500);
        System.out.println("Please Wait..");
        List<? super R> tireList = garage.getFourWheelerSpace().getFourWheelerRack().getTireList();


//        for (Object tire : tireList) {
//            if (tire instanceof VanTire) {
//                vanTire = (VanTire) tire;
//            }
//        }

        VanTire vanTire = tireList.stream()
                .filter(tire -> tire instanceof VanTire)
                .map(VanTire.class::cast)
                .findAny()
                .orElse(null);


        System.out.println("|Changing tires of the van to: " + vanTire.getBrand() +
                "|Description: " + vanTire.getDescription());

        Thread.sleep(2000);
        System.out.println("Done");
        van.setVanTire(vanTire);
    }


}
