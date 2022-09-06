package homework14.task1.model;

public class Truck extends Car {
    private double loadCapacity;
    private double height;

    public Truck(double maxSpeed, double price, String model, String color,
                 double fuelConsumption, double loadCapacity, double height) {
        super(maxSpeed, price, model, color, fuelConsumption);
        this.loadCapacity = loadCapacity;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Car Truck: " + "Max speed: " + getMaxSpeed() + ", Price: " + getPrice() +
                ", Model: " + getModel() + ", Color: " + getColor() +
                ", Fuel consumption: " + getFuelConsumption() +
                ", Load capacity: " + loadCapacity +
                ", Height: " + height;
    }

}
