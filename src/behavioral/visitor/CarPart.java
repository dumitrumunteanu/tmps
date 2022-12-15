package behavioral.visitor;

// CarPart abstract class
public abstract class CarPart {
    // Accepts a CarPartVisitor
    public abstract void accept(CarPartVisitor visitor);
}
