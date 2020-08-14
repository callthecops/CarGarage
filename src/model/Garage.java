package model;

import model.twoWheelerGarageComponents.TwoWheelerSpace;
import model.fourWheelerGarageComponents.FourWheelerSpace;

public class Garage<T, R> {
    private final TwoWheelerSpace<T> TwoWheelerSpace = new TwoWheelerSpace<>();

    private final FourWheelerSpace<R> fourWheelerSpace = new FourWheelerSpace<>();


    public TwoWheelerSpace<T> getTwoWheelerSpace() {
        return TwoWheelerSpace;
    }


    public FourWheelerSpace<R> getFourWheelerSpace() {
        return fourWheelerSpace;
    }

}
