package structural.adapter;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the ElectricCar class
        ElectricCar electricCar = new ElectricCar();

        // Create an instance of the ElectricCarAdapter class, passing the electricCar object to it
        ElectricCarAdapter electricCarAdapter = new ElectricCarAdapter(electricCar);

        // Create an instance of the Car class, passing the electricCarAdapter object to it
        Car car = new Car(electricCarAdapter);

        // Call the fillUp and move methods on the car object
        car.fillUp();
        // Output: "Charging battery."

        car.move();
        // Output: "Using electricity to move the car."
    }
}
