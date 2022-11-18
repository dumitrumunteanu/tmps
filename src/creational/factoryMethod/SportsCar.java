package creational.factoryMethod;

import creational.builder.*;

public class SportsCar implements Car {
    @Override
    public void build() {
        Director director = new Director();

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nSports car built:\n" + carManual.print());
    }
}
