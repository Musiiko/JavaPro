package homework13.model;


public class DreamCar extends Car {
    private boolean fourDoored;

    public DreamCar(double maxSpeed, double price, String model, String color,
                    double fuelConsumption, boolean fourDoored) {
        super(maxSpeed, price, model, color, fuelConsumption);
        this.fourDoored = fourDoored;
    }

    @Override
    public String toString() {
        return "Car DreamCar: " + "Max speed: " + getMaxSpeed() + ", Price: " + getPrice() +
                ", Model: " + getModel() + ", Color: " + getColor() +
                ", Fuel consumption: " + getFuelConsumption() +
                ", Four doored: " + fourDoored;
    }

}
