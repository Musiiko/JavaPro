package homework16.model;


public class Bus extends Car {
    private double passengerCapacity;

    public Bus(double maxSpeed, double price, String model, String color,
               double fuelConsumption, double passengerCapacity) {
        super(maxSpeed, price, model, color, fuelConsumption);
        this.passengerCapacity = passengerCapacity;

    }

    @Override
    public String toString() {
        return "Car Bus: " + " Max speed: " + getMaxSpeed() + ", Price: " + getPrice() +
                ", Model: " + getModel() + ", Color: " + getColor() +
                ", Fuel consumption: " + getFuelConsumption() +
                ", Number of passengers: " + passengerCapacity;
    }

}
