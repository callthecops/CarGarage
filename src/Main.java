import display.Display;
import model.Garage;
import model.fourWheeler.tires.CarTire;
import model.fourWheeler.tires.FourWheeler;
import model.fourWheeler.tires.VanTire;
import model.twoWheeler.tires.MotorBikeTire;
import model.twoWheeler.tires.ScooterTire;
import model.twoWheeler.tires.TwoWheeler;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        Garage<TwoWheeler, FourWheeler> garage = getTwoWheelerFourWheelerGarage();
        //Displaying the user selection menu
        Display<TwoWheeler, FourWheeler> display = new Display<>(garage);

        display.displayCarMenu();


    }

    public static Garage<TwoWheeler, FourWheeler> getTwoWheelerFourWheelerGarage() {
        //Initialising Garage
        Garage<TwoWheeler, FourWheeler> garage = new Garage<>();
        //Creating and adding 2wheeler tires to the already created Rack List.
        List<? super TwoWheeler> thelist = garage.getTwoWheelerSpace().getTwoWheelerRack().getTireList();
        MotorBikeTire motorBikeTire = new MotorBikeTire("Our tires work on any weather", "Kawasaki/MotorBike");
        ScooterTire scooterTires = new ScooterTire("Very durable tires!", "Michelin/Scooter");
        thelist.add(motorBikeTire);
        thelist.add(scooterTires);
        //Creating and adding 4wheeler tires to the already created Rack List.
        List<? super FourWheeler> theList2 = garage.getFourWheelerSpace().getFourWheelerRack().getTireList();
        CarTire carTire = new CarTire("The tires lifespan is 100 years!", "Continental/Car");
        VanTire vanTire = new VanTire("Rubber made of steel(marketing says so)", "Dunlop/Van");
        theList2.add(carTire);
        theList2.add(vanTire);
        return garage;
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
