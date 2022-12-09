package structural.adapter;

// The adaptee class
class ElectricCar {
    public void chargeBattery() {
        System.out.println("Charging battery.");
    }

    public void useElectricity() {
        System.out.println("Using electricity to move the car.");
    }
}
