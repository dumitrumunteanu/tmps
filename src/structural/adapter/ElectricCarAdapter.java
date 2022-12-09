package structural.adapter;

// The adapter class
class ElectricCarAdapter {
    private final ElectricCar electricCar;

    public ElectricCarAdapter(ElectricCar electricCar) {
        this.electricCar = electricCar;
    }

    public void fillTank() {
        electricCar.chargeBattery();
    }

    public void drive() {
        electricCar.useElectricity();
    }
}
