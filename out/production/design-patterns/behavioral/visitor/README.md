# Visitor

---

The visitor design pattern is a behavioral design pattern that allows you to add new functionality to an existing object without modifying the object itself. This is useful when you have a large number of objects with similar functionality and you want to add a new operation that applies to all of them.

In the example code, the CarPartVisitor interface defines a visit method for each type of car part, such as visitEngine(Engine engine) and visitTire(Tire tire). This allows a CarPartVisitor to perform a different action for each type of car part.
```java
public interface CarPartVisitor {
    void visitEngine(Engine engine);

    void visitTire(Tire tire);
    // You can add more visit methods for different types of car parts here
}
```

The Car class contains a list of CarPart objects, such as an engine and tires. The Car class has an accept(CarPartVisitor visitor) method that allows a CarPartVisitor to visit each part of the car. This is done by calling the accept method on each car part in the list, which in turn calls the appropriate visit method on the CarPartVisitor for that car part.
```java
public class Car {
    private List<CarPart> carParts = new ArrayList<>();

    public void addCarPart(CarPart carPart) {
        carParts.add(carPart);
    }

    // Accepts a CarPartVisitor to visit each car part
    public void accept(CarPartVisitor visitor) {
        for (CarPart carPart : carParts) {
            carPart.accept(visitor);
        }
    }
}
```

The Engine and Tire classes extend the CarPart abstract class and implement the accept method to call the appropriate visit method on a CarPartVisitor.

In the main method, a Car object is created and populated with an engine and four tires.
```java
Car car = new Car();
car.addCarPart(new Engine());
car.addCarPart(new Tire());
car.addCarPart(new Tire());
car.addCarPart(new Tire());
car.addCarPart(new Tire());
```
Then, a CarPartVisitor is created and passed to the Car object's accept method. This causes the visitor to inspect each car part in the car.
```java
CarPartVisitor visitor = new CarPartVisitor() {
    @Override
    public void visitEngine(Engine engine) {
        System.out.println("Inspecting engine");
        // Perform inspection on engine here
    }

    @Override
    public void visitTire(Tire tire) {
        System.out.println("Inspecting tire");
        // Perform inspection on tire here
    }
};

car.accept(visitor);
```

Overall, this code demonstrates how the visitor design pattern can be used to add new functionality to a set of objects without modifying the objects themselves. This allows you to easily add new operations that apply to all of the objects, which can be useful in many different scenarios.