package homework16.impl;

import homework16.function.SortFuelComparator;
import homework16.model.Car;

import java.util.List;

public class TaxiStation {
    public double calculatePrice(List<Car> list) {
        double totalPrice = list.stream().mapToDouble(car -> car.getPrice()).sum();

        return totalPrice;
    }

    public void sortFuel(List<Car> list) {
        list.stream().sorted(new SortFuelComparator()).forEach(System.out::println);
    }

    public void findCarsBySpeed(List<Car> list, int min, int max) {

        list.stream().filter(car -> car.getMaxSpeed() >= min && car.getMaxSpeed() <= max).forEach(System.out::println);
    }

}
