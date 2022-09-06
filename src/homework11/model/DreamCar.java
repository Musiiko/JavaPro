package homework11.model;

public class DreamCar extends Car {
    private boolean fourDoored;

    public DreamCar(double maxSpeed, double price, String model, String color,
                    double fuelConsumtion, boolean fourDoored) {
        super(maxSpeed, price, model, color, fuelConsumtion);
        this.fourDoored = fourDoored;
    }

    @Override
    public String toString() {
        return "Max speed: " + getMaxSpeed() + "\nPrice: " + getPrice() +
                "\nModel: " + getModel() + "\nCorol: " + getColor() +
                "\nFuel consumption: " + getFuelConsumption() +
                "\nFour doored: " + fourDoored + "\n";
    }

}
