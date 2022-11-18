package creational.astractFactory;

import creational.factoryMethod.Car;

public class FutureCorporation extends Corporation {
    @Override
    public Car createCar() {
        return new FutureSimpleCar();
    }

    @Override
    public ElectricCar createElectricCar() {
        return new FutureElectricCar();
    }
}
