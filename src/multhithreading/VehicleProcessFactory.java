package multhithreading;

import model.Garage;
import model.Vehicle;
import model.vehicles.MotorBike;
import model.vehicles.Scooter;

public class VehicleProcessFactory<T> implements Runnable {

    private Vehicle vehicle;
    private Garage<T> garage;
    private FactoryLogic<T> factoryLogic;

    public VehicleProcessFactory(Vehicle vehicle, Garage<T> garage) {
        this.vehicle = vehicle;
        this.garage = garage;
        this.factoryLogic = new FactoryLogic<T>();
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
            System.out.println("Changing the tires to the Scooter");

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


    public Garage<T> getGarage() {
        return garage;
    }

    public void setGarage(Garage<T> garage) {
        this.garage = garage;
    }


    public void isInstanceOfMotorBike() {
        System.out.println("Changing the tires to the MotorBike\n");
        try {
            System.out.println("Please wait..\n");
            Thread.sleep(3000);
            factoryLogic.vehicleIsMotorBike(vehicle, garage);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }


}
