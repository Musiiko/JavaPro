package homework13.comparator;

import homework13.model.Car;

import java.util.Comparator;


public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car a1, Car a2) {
        if (a1.getFuelConsumption() > a2.getFuelConsumption()) {
            return 1;
        }
        if (a1.getFuelConsumption() < a2.getFuelConsumption()) {
            return -1;
        }
        return 0;
    }

}
