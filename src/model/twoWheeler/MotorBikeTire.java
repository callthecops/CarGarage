package model.twoWheeler;

public class MotorBikeTire extends Tire implements TwoWheeler {

    private Enum<TwoWheelerTireTypes> type;

    public void changeTwoTires() {
        System.out.println("Motor Bike Tires have been changed");
    }

    public MotorBikeTire(String description, String brand) {
        this.description = description;
        this.brand = brand;
        this.type = TwoWheelerTireTypes.MOTORBIKE;
    }

    public Enum<TwoWheelerTireTypes> getType() {
        return type;
    }

    public void setType(Enum<TwoWheelerTireTypes> type) {
        this.type = type;
    }
}
