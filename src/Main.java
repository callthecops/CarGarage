import model.tires.twowheeler.MotorBikeTires;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a new CarGarage project");
        MotorBikeTires tires = new MotorBikeTires();
        tires.description = "asd";
        System.out.println(tires.getDescription());
    }
}
