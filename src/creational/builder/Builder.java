package creational.builder;

import creational.builder.components.CarType;
import creational.builder.components.Engine;
import creational.builder.components.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
}
