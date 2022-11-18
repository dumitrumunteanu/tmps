package creational.astractFactory;

import creational.factoryMethod.Car;

public abstract class Corporation {
    public abstract Car createCar();
    public abstract ElectricCar createElectricCar();
}
