package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        boolean condition = false; // some Condition That Will Change Which Factory To Use

        Car car;

        if (condition) {
            car = new CityCar();
        } else {
            car = new SportsCar();
        }

        car.build();
    }
}
