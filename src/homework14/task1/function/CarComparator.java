package homework14.task1.function;

import homework14.task1.model.Car;


public class CarComparator {

    public static int compare(Car car1, Car car2) {
        return Double.compare(car1.getFuelConsumption(), car2.getFuelConsumption());
    }

}

