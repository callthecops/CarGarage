package model.twoWheelerGarageComponents;

import model.twoWheeler.MotorBikeTire;
import model.twoWheeler.ScooterTire;

import java.util.List;

public class TwoWheelerRack<T> {
    private List<T> tireList;


    public TwoWheelerRack(){}

    public TwoWheelerRack(List<T> tireList){
        this.tireList=tireList;
    }


    public List<T> getTireList() {
        return tireList;
    }


    public void setTireList(List<T> tireList) {
        this.tireList = tireList;
    }


    public void checkRackTireQuantity() {
        System.out.println(tireList.size());
    }
}

