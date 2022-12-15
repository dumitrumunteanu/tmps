# Observer

---

The observer design pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

First, let's start with the Observer interface:
```java
public interface Observer {
    void update(int speed);
}
```

This is the interface that the observer classes will implement. It has a single method, update(), which is called by the subject when the state of the subject changes. The update() method takes a parameter, in this case the current speed of the car, which the observer can use to update its own state.

Next, let's look at the Car class:
```java
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
```
This is the subject class, representing a car. It maintains a list of its observers and has methods to register and unregister observers, notify them of a change in state, and set its own state (the speed of the car).

Next, let's look at the Speedometer class, which is an observer of the Car class:
```java
public class Speedometer implements Observer {
    private int speed;

    // Update the speed when notified by the subject
    public void update(int speed) {
        this.speed = speed;
        display();
    }

    // Display the current speed
    public void display() {
        System.out.println("Current speed: " + speed);
    }
}
```
This class implements the Observer interface and therefore has an update() method. When the Car notifies its observers of a change in state, the update() method of the Speedometer is called and the current speed of the car is passed as a parameter. The update() method updates the speed field of the Speedometer and then calls the display() method, which simply prints the current speed to the console.

Finally, let's look at the main() method, which tests the observer design pattern:
```java
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
```
In the main() method, we create an instance of the Car class and an instance of the Speedometer class. We then register the Speedometer as an observer of the Car by calling the registerObserver() method on the Car instance and passing the Speedometer instance as a parameter.

Next, we set the speed of the Car by calling the setSpeed() method and passing the desired speed as a parameter. This causes the Car to notify its observers, which in this case is the Speedometer. The Speedometer receives the notification and calls its update() method, which updates the speed field of the Speedometer and then calls the display() method to print the current speed to the console.

This process repeats for the next two calls to setSpeed(), so the output of the main() method will be:
```
Current speed: 20
Current speed: 30
Current speed: 40
```

Finally, we unregister the Speedometer as an observer of the Car by calling the unregisterObserver() method on the Car instance and passing the Speedometer instance as a parameter. We then set the speed of the Car again by calling setSpeed(), but this time the Speedometer is not notified because it is no longer registered as an observer of the Car. Therefore, no output is printed to the console.
