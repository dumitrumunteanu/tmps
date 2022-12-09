package structural.proxy;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the CarProxy class
        Car car = new CarProxy();
        car.setName("My car");
        car.setSpeed(60);

        // Perform operations on the CarProxy object
        car.start();
        // Output: "Starting car."

        car.stop();
        // Output: "Stopping car."
    }
}
