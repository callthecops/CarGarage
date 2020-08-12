import model.twoWheeler.MotorBikeTire;
import model.twoWheeler.ScooterTire;
import model.twoWheeler.TwoWheeler;
import model.twoWheelerGarageComponents.TwoWheelerRack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MotorBikeTire motorBikeTire = new MotorBikeTire("Our tires work on any weather", "Kawasaki");
        ScooterTire scooterTires = new ScooterTire("Very durable tires!", "Michelin");

        List<? super TwoWheeler> list = new ArrayList<>();
        TwoWheelerRack twoWheelerRack = new TwoWheelerRack(list);

        list.add(motorBikeTire);
        list.add(scooterTires);

        twoWheelerRack.checkRackTireQuantity();


    }

    public static TwoWheeler retrieveTireType(List<? super TwoWheeler> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof MotorBikeTire) {
                return (MotorBikeTire) list.get(i);
            } else {
                return (ScooterTire) list.get(i);
            }
        }
        return null;
    }
}
