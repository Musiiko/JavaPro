package homework11;


import homework11.model.Car;
import homework11.processor.CarParkProcessor;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Sergey\\NewJavaProject\\JavaPro\\src\\homework11\\cars.txt";
        String newFileName = "C:\\Users\\Sergey\\NewJavaProject\\JavaPro\\src\\homework11\\newCars.txt";
        CarParkProcessor carStreamService = new CarParkProcessor(fileName);
        Car[] cars = carStreamService.getCarsArray();

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + "." + cars[i].toString());
        }
        carStreamService.writeCarsArray(cars, newFileName);
    }

}
