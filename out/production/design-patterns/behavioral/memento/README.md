# Memento

---

Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

To implement the memento design pattern, we need to create two classes: a Car class and a CarMemento class. The Car class would represent the object that we want to save the state of, and the CarMemento class would be used to store the state of the Car object.

Here is the Car class:
```java
public class Car {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public CarMemento saveState() {
        return new CarMemento(state);
    }

    public void restoreState(CarMemento memento) {
        this.state = memento.getState();
    }
}
```

The Car class has a state attribute that represents the current state of the car. It has methods for setting and getting the state of the car, as well as methods for saving and restoring the state of the car using a CarMemento object.

Here is the CarMemento class:
```java
public class CarMemento {
    private final String state;

    public CarMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
```

The CarMemento class has a state attribute that stores the state of the Car object. It has a constructor that takes the state of the Car object as an argument, and it has a getter method for retrieving the state.

To use the memento pattern, you would first create a Car object and set its state. Then, you would save the state of the Car object using the saveState() method, which creates and returns a CarMemento object with the current state of the Car object. Later, if you want to restore the state of the Car object, you can use the restoreState() method and pass in the CarMemento object that you saved earlier.

Here is the demonstrated usage of this design pattern:
```java
Car car = new Car();
car.setState("RUNNING");

// Save the state of the car
CarMemento memento = car.saveState();

// Change the state of the car
car.setState("STOPPED");

// Restore the state of the car
car.restoreState(memento);

```
