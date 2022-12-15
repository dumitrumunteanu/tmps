package behavioral.observer;

// Test the observer design pattern
public class Main {
    public static void main(String[] args) {
        // Create a subject (car) and an observer (speedometer)
        Car car = new Car();
        Speedometer speedometer = new Speedometer();

        // Register the speedometer as an observer of the car
        car.registerObserver(speedometer);

        // Set the speed of the car and see if the observer is notified
        car.setSpeed(20);  // Current speed: 20
        car.setSpeed(30);  // Current speed: 30
        car.setSpeed(40);  // Current speed: 40

        // Unregister the observer and set the speed again to see if it is notified
        car.unregisterObserver(speedometer);
        car.setSpeed(50);  // (Nothing is printed)
    }
}

