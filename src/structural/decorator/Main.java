package structural.decorator;

// The Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the BasicCar class
        BasicCar basicCar = new BasicCar();
        basicCar.setName("Basic car");

        // Wrap the basic car in a TurboDecorator and a NitroDecorator
        Car car = new NitroDecorator(new TurboDecorator(basicCar, 50), 100);

        // Call the start and stop methods on the decorated car
        car.start();
        // Output: "Starting car."
        //         "Applying turbo boost."
        //         "Injecting nitrous oxide."

        car.stop();
        // Output: "Releasing nitrous oxide."
        //         "Releasing turbo boost."
        //         "Stopping car."
    }
}
