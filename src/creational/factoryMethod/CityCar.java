package creational.factoryMethod;

import creational.builder.*;

public class CityCar implements Car {
    @Override
    public void build() {
        Director director = new Director();

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCity car built:\n" + carManual.print());
    }
}
