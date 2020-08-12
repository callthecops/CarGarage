import display.Display;
import model.Garage;
import model.twoWheeler.tires.MotorBikeTire;
import model.twoWheeler.tires.ScooterTire;
import model.twoWheeler.tires.TwoWheeler;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Initialising Garage
        Garage<TwoWheeler> garage = new Garage<>();
        //Creating and adding 2wheeler tires to the already created Rack List.
        List<? super TwoWheeler> thelist = garage.gettTwoWheelerSpace().getTwoWheelerRack().getTireList();
        MotorBikeTire motorBikeTire = new MotorBikeTire("Our tires work on any weather", "Kawasaki/MotorBike");
        ScooterTire scooterTires = new ScooterTire("Very durable tires!", "Michelin/Scooter");
        thelist.add(motorBikeTire);
        thelist.add(scooterTires);


        //Displaying the user selection menu
        Display<TwoWheeler> display = new Display<>(garage);

        display.displayCarMenu();


    }

    public static TwoWheeler retrieveTireType(List<? super TwoWheeler> list) {
        for (Object o : list) {
            if (o instanceof MotorBikeTire) {
                return (MotorBikeTire) o;
            } else {
                return (ScooterTire) o;
            }
        }
        return null;
    }
}
