package multhithreading;

import model.Garage;
import model.Vehicle;
import model.vehicles.Car;
import model.vehicles.MotorBike;
import model.vehicles.Scooter;

public class VehicleProcessFactory<T, R> implements Runnable {

    private Vehicle vehicle;
    private Garage<T, R> garage;
    private FactoryLogic<T, R> factoryLogic;

    public VehicleProcessFactory(Vehicle vehicle, Garage<T, R> garage) {
        this.vehicle = vehicle;
        this.garage = garage;
        this.factoryLogic = new FactoryLogic<T, R>();
    }

    @Override
    public void run() {
        vehicle.startEngine();
        try {
            Thread.sleep(1000);
            vehicle.driveIn();
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        if (vehicle instanceof MotorBike) {
            isInstanceOfMotorBike();
        } else if (vehicle instanceof Scooter) {
            isInstanceOfScooter();
        } else if (vehicle instanceof Car) {
            isInstanceOfCar();
        } else {
            isInstanceOfVan();
        }
        try {
            Thread.sleep(1000);
            vehicle.driveOut();
            Thread.sleep(2000);
            vehicle.stopEngine();

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }


    public Garage<T, R> getGarage() {
        return garage;
    }

    public void setGarage(Garage<T, R> garage) {
        this.garage = garage;
    }


    public void isInstanceOfMotorBike() {
        System.out.println("Preparing MotorBike Rack\n");
        try {
            System.out.println("Please wait..\n");
            Thread.sleep(3000);
            factoryLogic.vehicleIsMotorBike(vehicle, garage);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void isInstanceOfScooter() {
        System.out.println("Preparing Scooter Rack\n");
        try {
            System.out.println("Please wait..\n");
            Thread.sleep(3000);
            factoryLogic.vehicleIsScooter(vehicle, garage);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }


    public void isInstanceOfCar() {
        System.out.println("Preparing Car Rack\n");
        try {
            System.out.println("Please wait..\n");
            Thread.sleep(3000);
            factoryLogic.vehicleIsCar(vehicle, garage);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void isInstanceOfVan() {
        System.out.println("Preparing Van Rack\n");
        try {
            System.out.println("Please wait..\n");
            Thread.sleep(3000);
            factoryLogic.vehicleIsVan(vehicle, garage);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
