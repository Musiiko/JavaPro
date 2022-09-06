package homework11.data;

import homework11.model.Car;

import java.util.Arrays;

public class ArrayData {

    public static Car[] expandArray(Car[] cars, Car newCar) {
        if (cars.length == 0) {
            return new Car[]{newCar};
        } else {
            Car[] newCars = Arrays.copyOf(cars, cars.length + 1);
            newCars[cars.length] = newCar;
            return newCars;
        }
    }

}
