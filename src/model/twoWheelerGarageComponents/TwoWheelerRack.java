package model.twoWheelerGarageComponents;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerRack<T> {
    private List<? super T> tireList;


    public TwoWheelerRack() {
        this.tireList = new ArrayList<>();
    }


    public List<? super T> getTireList() {
        return tireList;
    }

    public void setTireList(List<? super T> tireList) {
        this.tireList = tireList;
    }

    public void checkRackTireQuantity() {
        System.out.println(tireList.size());
    }
}

