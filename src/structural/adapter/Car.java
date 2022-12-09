package structural.adapter;

// The client class
class Car {
    private ElectricCarAdapter electricCarAdapter;

    public Car(ElectricCarAdapter electricCarAdapter) {
        this.electricCarAdapter = electricCarAdapter;
    }

    public void fillUp() {
        electricCarAdapter.fillTank();
    }

    public void move() {
        electricCarAdapter.drive();
    }
}
