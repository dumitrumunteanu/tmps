package structural.flyweight;

// The Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the CarFactory class
        CarFactory factory = new CarFactory();

        // Get two flyweight objects from the factory
        Car car1 = factory.getCar("My car");
        Car car2 = factory.getCar("My car");

        // Set the unique state of the flyweight objects
        car1.setSpeed(60);
        car2.setSpeed(80);

        // Perform operations on the flyweight objects
        car1.start();
        // Output: "Starting car."
        car1.stop();
        // Output: "Stopping car."

        car2.start();
        // Output: "Starting car."
        car2.stop();
        // Output: "Stopping car."
    }
}