package creational.factoryMethod;

import creational.factoryMethod.CityCar;

public abstract class CarFactory {
    public Car create() {
        Car car = createCar();
        car.build();

        return car;
    }

    protected abstract Car createCar();
}
