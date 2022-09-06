package homework14.task1.impl;

import homework14.task1.function.CarComparator;
import homework14.task1.model.Car;
import homework14.task1.taxi.TaxiStation;

import java.util.ArrayList;
import java.util.Collections;

public class TaxiStationName implements TaxiStation {

    private ArrayList<Car> cars;

    public TaxiStationName() {
    }

    public TaxiStationName(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public double calculateCostOfTaxiStation() {
        double costOfTaxiStation = 0;
        for (Car car : cars) {
            costOfTaxiStation += car.getPrice();
        }
        return costOfTaxiStation;
    }

    public ArrayList<Car> searchBySpeed(double min, double max) {
        ArrayList<Car> foundCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() > min && car.getMaxSpeed() < max)
                foundCars.add(car);
        }
        return foundCars;
    }

    public void sortByFuelConsumption() {
        Collections.sort(cars, CarComparator::compare);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars.addAll(cars);
    }

}
