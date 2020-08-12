package display;

import model.Garage;
import service.AppLogic;
import service.GarageLogic;

public class Display<T> {
    private final GarageLogic garageLogic;
    private final AppLogic appLogic;
    private final Garage<T> garage;

    public Display(Garage<T> garage) {
        this.garage = garage;
        this.appLogic = new AppLogic();
        this.garageLogic = new GarageLogic();
    }


    public void displayCarMenu() {
        System.out.println("Please choose a vehicle to change tires for\n\n" +
                "1.MotorBike\n" +
                "2.Scooter\n" +
                "3.Car\n" +
                "4.Van\n" +
                "5.Exit\n");

        int choice = appLogic.retrieveUserChoice();
        appLogic.useUserChoice(choice);
    }
}
