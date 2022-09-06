package homework14.task1.taxi;

import homework14.task1.model.Car;

import java.util.ArrayList;

public interface TaxiStation {
    double calculateCostOfTaxiStation();

    ArrayList<Car> searchBySpeed(double min, double max);

    void sortByFuelConsumption();

    ArrayList<Car> getCars();
}