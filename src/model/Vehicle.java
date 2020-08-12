package model;

import model.vehicles.Parkable;

public interface Vehicle extends Parkable {

    void startEngine();

    void stopEngine();
}
