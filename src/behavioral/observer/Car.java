package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Car {
    // List of observers that are registered to this subject
    private List<Observer> observers = new ArrayList<>();
    private int speed;

    // Register an observer to this subject
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Unregister an observer from this subject
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all registered observers of a change in state
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(speed);
        }
    }

    // Set the speed of the car and notify observers of the change
    public void setSpeed(int speed) {
        this.speed = speed;
        notifyObservers();
    }
}
