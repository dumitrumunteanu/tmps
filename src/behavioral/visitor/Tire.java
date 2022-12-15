package behavioral.visitor;

// Tire class that extends CarPart
public class Tire extends CarPart {
    @Override
    public void accept(CarPartVisitor visitor) {
        visitor.visitTire(this);
    }
}
