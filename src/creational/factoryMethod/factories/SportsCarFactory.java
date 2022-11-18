package creational.factoryMethod.factories;

import creational.factoryMethod.Car;
import creational.factoryMethod.CarFactory;
import creational.factoryMethod.SportsCar;

public class SportsCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new SportsCar();
    }
}
