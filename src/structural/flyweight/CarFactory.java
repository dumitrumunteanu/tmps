package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// The CarFactory class
class CarFactory {
    private static final Map<String, Car> pool = new HashMap<>();

    public static Car getCar(String name) {
        Car car = pool.get(name);

        if (car == null) {
            car = new BasicCar();
            car.setName(name);
            pool.put(name, car);
        }

        return car;
    }
}
