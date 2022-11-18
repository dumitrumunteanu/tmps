package creational.factoryMethod.factories;

import creational.factoryMethod.Car;
import creational.factoryMethod.CarFactory;
import creational.factoryMethod.CityCar;

public class CityCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new CityCar();
    }
}
