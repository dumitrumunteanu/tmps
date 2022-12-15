package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

// Car class that contains a list of CarPart objects
public class Car {
    private List<CarPart> carParts = new ArrayList<>();

    public void addCarPart(CarPart carPart) {
        carParts.add(carPart);
    }

    // Accepts a CarPartVisitor to visit each car part
    public void accept(CarPartVisitor visitor) {
        for (CarPart carPart : carParts) {
            carPart.accept(visitor);
        }
    }
}
