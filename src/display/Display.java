package display;

import model.Garage;
import model.Vehicle;
import multhithreading.VehicleProcessFactory;
import service.AppLogic;
import multhithreading.FactoryLogic;

public class Display<T, R> {
    private final FactoryLogic factoryLogic;
    private final AppLogic appLogic;
    private final Garage<T, R> garage;

    public Display(Garage<T, R> garage) {
        this.garage = garage;
        this.appLogic = new AppLogic();
        this.factoryLogic = new FactoryLogic();
    }


    public void displayCarMenu() {
        System.out.println("Please choose a vehicle to change tires for\n\n" +
                "1.MotorBike\n" +
                "2.Scooter\n" +
                "3.Car\n" +
                "4.Van\n" +
                "5.Exit\n");

        int choice = appLogic.retrieveUserChoice();
        Vehicle vehicle = appLogic.useUserChoiceToSelectVehicleForTireChange(choice);
        //Using Thread
        Runnable job = new VehicleProcessFactory<>(vehicle, garage);
        Thread thread = new Thread(job);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        //Using Recursion
        displayCarMenu();
    }


}
