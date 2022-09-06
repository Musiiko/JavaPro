package homework14.task1;

import homework14.task1.impl.TaxiStationName;
import homework14.task1.model.Bus;
import homework14.task1.model.Car;
import homework14.task1.model.DreamCar;
import homework14.task1.model.Truck;
import homework14.task1.taxi.TaxiStation;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Truck(180, 70500, "Mercedes", "green", 35,
                35, 3.2));
        cars.add(new DreamCar(200, 80000, "BMW", "black", 32,
                true));
        cars.add(new Bus(120, 67000, "Mercedes", "grey",
                33, 60));
        cars.add(new Truck(160, 50000, "MAN", "white", 30,
                30, 2.6));
        TaxiStation station = new TaxiStationName(cars);
        double sumCostOfStation;
        ArrayList<Car> searchedBySpeed;

        sumCostOfStation = station.calculateCostOfTaxiStation();
        station.sortByFuelConsumption();
        System.out.println("Sorted by fuelConsumption: ");
        System.out.println(station.getCars());
        searchedBySpeed = station.searchBySpeed(120, 200);
        System.out.println("Summary cost of taxi station = " + sumCostOfStation);
        System.out.println("Sorted by speed: ");
        System.out.println(searchedBySpeed);
    }


}
