package homework13.processor;

import homework13.model.Car;

import java.util.Arrays;
import java.util.Comparator;

public class CarPark implements CarParkProcessor {
    private Car[] cars;

    private Car[] fitsRange;

    public CarPark(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public double parkCost() {
        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }

    public void sortFuelConsumption(Comparator<Car> comparator) {
        Arrays.sort(cars, comparator);
    }

    public Car[] arrayIncrement(Car[] cars) {
        Car[] newArray = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            newArray[i] = cars[i];
        }
        return newArray;
    }

    @Override
    public Car[] fitsRange(double minSpeed, double maxSpeedAllowed) {
        Car[] resultArray = new Car[]{};
        for (Car car : cars) {
            if (car.getMaxSpeed() <= maxSpeedAllowed && car.getMaxSpeed() >= minSpeed) {
                resultArray = pushBack(car, resultArray);
            }
        }
        return resultArray;
    }

    private Car[] pushBack(Car car, Car[] carArray) {
        Car[] resultArray = new Car[carArray.length + 1];
        arrayCopy(carArray, resultArray);
        resultArray[resultArray.length - 1] = car;
        return resultArray;
    }

    private void arrayCopy(Car[] copyFromArray, Car[] copyToArray) {
        for (int i = 0; i < Math.min(copyFromArray.length, copyToArray.length); i++) {
            copyToArray[i] = copyFromArray[i];
        }
    }

    public static int compare(Car a1, Car a2) {
        if (a1.getFuelConsumption() > a2.getFuelConsumption()) {
            return 1;
        }
        if (a1.getFuelConsumption() < a2.getFuelConsumption()) {
            return -1;
        }
        return 0;
    }

}
