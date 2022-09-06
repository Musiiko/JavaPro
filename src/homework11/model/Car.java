package homework11.model;

public abstract class Car {
    private double maxSpeed;
    private double price;
    private String model;
    private String color;
    private double fuelConsumption;

    public Car(double maxSpeed, double price, String model, String color, double fuelConsumption) {

        this.maxSpeed = maxSpeed;
        this.price = price;
        this.model = model;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

}

