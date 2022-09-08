package homework13;

/* В таксопарке реализовать метод по сортировке автомобилей по
расходу топлива с помощью Arrays.sort, который принимает компаратор.
Компаратор реализовать тремя способами: реализация интерфейса,
лямбда-выражение и ссылка на метод. */

import homework13.comparator.CarComparator;
import homework13.model.Bus;
import homework13.model.Car;
import homework13.model.DreamCar;
import homework13.model.Truck;
import homework13.processor.CarPark;


import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[]{new Truck(180, 70500, "Mercedes", "green", 35,
                35, 3.2),
                new DreamCar(200, 80000, "BMW", "black", 32,
                        true),
                new Bus(120, 67000, "Mercedes", "grey",
                        33, 60),
                new Truck(160, 50000, "MAN", "white", 30,
                        30, 2.6)};

        CarPark park = new CarPark(cars);

        System.out.println("\nTest 1.Interface implementation");
        CarComparator carComparator = new CarComparator();
        park.sortFuelConsumption(carComparator);
        printCars(cars);

        System.out.println("\nTest 2.Lambda's implementation");
        Comparator<Car> comparatorLambda = (Car1, Car2) -> {
            if (Car1.getFuelConsumption() > Car2.getFuelConsumption()) {
                return 1;
            }
            if (Car1.getFuelConsumption() < Car2.getFuelConsumption()) {
                return -1;
            }
            return 0;
        };
        park.sortFuelConsumption(comparatorLambda);
        printCars(cars);

        System.out.println("\nTest 3.Link to method");
        park.sortFuelConsumption(CarPark::compare);
        printCars(cars);
    }


    private static void printCars(Car[] cars) {
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

}
