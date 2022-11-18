package creational.astractFactory;

public class FutureElectricCar implements ElectricCar {
    @Override
    public void build() {
        System.out.println("build future electric vehicle");
    }
}
