package structural.bridge;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the PetrolEngine class
        Engine petrolEngine = new PetrolEngine();

        // Create an instance of the PetrolCar class, passing the petrolEngine object to it
        Car petrolCar = new PetrolCar(petrolEngine);

        // Call the start and stop methods on the petrolCar object
        petrolCar.start();
        // Output: "Starting petrol engine."
        //         "Petrol car started."

        petrolCar.stop();
        // Output: "Stopping petrol engine."
        //         "Petrol car stopped."

        // Create an instance of the DieselEngine class
        Engine dieselEngine = new DieselEngine();

        // Create an instance of the DieselCar class, passing the dieselEngine object to it
        Car dieselCar = new DieselCar(dieselEngine);

        // Call the start and stop methods on the dieselCar object
        dieselCar.start();
        // Output: "Starting diesel engine."
        //         "Diesel car started."

        dieselCar.stop();
        // Output: "Stopping diesel engine."
        //         "Diesel car stopped."
    }
}
