import display.Display;
import model.Garage;
import model.twoWheeler.tires.MotorBikeTire;
import model.twoWheeler.tires.ScooterTire;
import model.twoWheeler.tires.TwoWheeler;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Garage<TwoWheeler> garage = new Garage<>();
        Display<TwoWheeler> display = new Display(garage);

        display.displayCarMenu();

//        Garage<TwoWheeler> garage = new Garage<>();
//        List<? super TwoWheeler> thelist = garage.gettTwoWheelerSpace().getTwoWheelerRack().getTireList();
//
//        MotorBikeTire motorBikeTire = new MotorBikeTire("Our tires work on any weather", "Kawasaki");
//        ScooterTire scooterTires = new ScooterTire("Very durable tires!", "Michelin");
//
//        thelist.add(motorBikeTire);
//        thelist.add(scooterTires);
//
//        System.out.println(thelist.size());

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
