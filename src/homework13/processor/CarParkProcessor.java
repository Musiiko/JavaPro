package homework13.processor;

import homework13.model.Car;

import java.util.Comparator;

public interface CarParkProcessor {
    double parkCost();

    void sortFuelConsumption(Comparator<Car> comparator);

    Car[] arrayIncrement(Car[] cars);

    Car[] fitsRange(double minSpeed, double maxSpeedAllowed);
}
