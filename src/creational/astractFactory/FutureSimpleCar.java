package creational.astractFactory;

import creational.factoryMethod.Car;

public class FutureSimpleCar implements Car {
    @Override
    public void build() {
        System.out.println("build future car");
    }
}
