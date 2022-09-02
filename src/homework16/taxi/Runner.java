package homework16.taxi;

import homework16.impl.TaxiStation;
import homework16.model.Bus;
import homework16.model.Car;
import homework16.model.DreamCar;
import homework16.model.Truck;

import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();
        list.add(new Truck(180, 70500, "Mercedes", "green", 35,
                35, 3.2));
        list.add(new DreamCar(200, 80000, "BMW", "black", 32,
                true));
        list.add(new Bus(120, 67000, "Mercedes", "grey",
                33, 60));
        list.add(new Truck(160, 50000, "MAN", "white", 30,
                30, 2.6));

        TaxiStation tx = new TaxiStation();

        System.out.println("1. Total cars' price sum");
        System.out.println(tx.calculatePrice(list) + " $");

        System.out.println("2.Sort by fuel consumption");
        tx.sortFuel(list);

        System.out.println("3.Find cars by speed range");
        tx.findCarsBySpeed(list, 180, 200);
    }

}


