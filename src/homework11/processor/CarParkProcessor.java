package homework11.processor;

import homework11.data.ArrayData;
import homework11.data.StreamData;
import homework11.model.Bus;
import homework11.model.Car;
import homework11.model.DreamCar;
import homework11.model.Truck;

import java.util.Arrays;

public class CarParkProcessor {

    private Car[] cars;
    final private String name;

    public CarParkProcessor(String name) {
        this.cars = new Car[]{};
        this.name = name;
    }

    public Car[] getCarsArray() {
        createCars(getCarParams());
        Car[] newCarsList = Arrays.copyOf(cars, cars.length);
        cars = new Car[]{};
        return newCarsList;
    }

    private String[] getCarParams() {
        String str = StreamData.readFile(name);
        if (str != null) {
            return str.split(";" + System.lineSeparator());
        }
        return new String[]{};
    }

    private void createCars(String[] newString) {
        for (String str : newString) {
            String[] params = str.split(",");
            switch (params[0]) {
                case "Bus":
                    cars = ArrayData.expandArray(cars, new Bus(Double.parseDouble(params[1]),
                            Double.parseDouble(params[2]), params[3], params[4],
                            Double.parseDouble(params[5]),
                            Double.parseDouble(params[6])));
                    break;
                case "DreamCar":
                    cars = ArrayData.expandArray(cars, new DreamCar(Double.parseDouble(params[1]),
                            Double.parseDouble(params[2]), params[3], params[4],
                            Double.parseDouble(params[5]),
                            Boolean.parseBoolean(params[6])));
                    break;
                case "Truck":
                    cars = ArrayData.expandArray(cars, new Truck(Double.parseDouble(params[1]),
                            Double.parseDouble(params[2]), params[3], params[4],
                            Double.parseDouble(params[5]),
                            Double.parseDouble(params[6]), Double.parseDouble(params[7])));
                    break;
            }
        }
    }

    public void writeCarsArray(Car[] cars, String fileName) {
        String str = "";
        for (int i = 0; i < cars.length; i++) {
            str += cars[i].getModel() + "," +
                    cars[i].getMaxSpeed() + "," +
                    cars[i].getPrice() + "," +
                    cars[i].getFuelConsumption() + ";" + System.lineSeparator();
        }
        StreamData.writeFile(fileName, str);
    }
}
