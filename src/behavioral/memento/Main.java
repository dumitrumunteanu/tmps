package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setState("RUNNING");

        // Save the state of the car
        CarMemento memento = car.saveState();

        // Change the state of the car
        car.setState("STOPPED");

        // Restore the state of the car
        car.restoreState(memento);
    }
}
