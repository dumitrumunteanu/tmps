package creational.astractFactory;

public class Main {
    public static void main(String[] args) {
        Corporation corporation = new FutureCorporation();

        corporation.createElectricCar().build();
    }
}
