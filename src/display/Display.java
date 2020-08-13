package display;

import model.Garage;
import model.Vehicle;
import multhithreading.VehicleProcessFactory;
import service.AppLogic;
import multhithreading.FactoryLogic;

public class Display<T> {
    private final FactoryLogic factoryLogic;
    private final AppLogic appLogic;
    private final Garage<T> garage;

    public Display(Garage<T> garage) {
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
        Runnable job = new VehicleProcessFactory<>(vehicle, garage);
        Thread thread = new Thread(job);
        thread.start();
//        appLogic.routToParking(Display.this);
        System.out.println("ASDASD");
    }

    public void displayParkingMessage() {
        System.out.println("Vehicle is out of the Garage and was successfully parked.\n");
        System.out.println("Please retrieve your keys from the reception,don't forget the payment!\n" + "Have a nice day!");
        displayCarMenu();
    }

}
