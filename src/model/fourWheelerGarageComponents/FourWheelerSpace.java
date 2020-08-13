package model.fourWheelerGarageComponents;


public class FourWheelerSpace<R> {
    FourWheelerRack<R> fourWheelerRack = new FourWheelerRack<>();

    public FourWheelerRack<R> getFourWheelerRack() {
        return fourWheelerRack;
    }

    public void setFourWheelerRack(FourWheelerRack<R> fourWheelerRack) {
        this.fourWheelerRack = fourWheelerRack;
    }
}
