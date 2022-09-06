package homework4;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("Toyota", "RAV4", 2015, "Red", 5000, "AA1111BB"),
                new Car("Toyota", "Camry", 2020, "Black", 7000, "AA8888CC"),
                new Car("Audi", "TT", 2018, "Green", 10000, "AA7777СС"),
                new Car("Opel", "Astra", 2010, "Red", 1000, "II3333CC"),
                new Car("Audi", "Q7", 2015, "Blue", 8000, "AA7777PP"),
                new Car("Opel", "Vectra A", 2015, "Yellow", 3100, "AX0202BB")
        };

        CarProcessor carProcessor = new CarProcessor(cars);
        System.out.println("Cars brand 'Toyota' : ");
        carProcessor.findCarByBrand("Toyota");
        System.out.println("\nCars by model 'TT' and more than 2 year in operation: ");
        carProcessor.findCarByModel("TT", 2);
        System.out.println("\nCars made in 2015 and price more than 4000: ");
        carProcessor.findCarByYear(2015, 4000);

        System.out.println();

        CarProcessor carProcessorDefault = new CarProcessor();
        System.out.println("Cars brand 'Opel':");
        carProcessorDefault.findCarByBrand(cars, "Opel");
        System.out.println("\nCars by model Astra and more than 5 year in operation:");
        carProcessorDefault.findCarByModel(cars, "Astra", 5);
        System.out.println("\nCars made in 2020 and price more than 6000$:");
        carProcessorDefault.findCarByYear(cars, 2020, 6000);

    }

}

