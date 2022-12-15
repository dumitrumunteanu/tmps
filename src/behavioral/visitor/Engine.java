package behavioral.visitor;

// Engine class that extends CarPart
public class Engine extends CarPart {
    @Override
    public void accept(CarPartVisitor visitor) {
        visitor.visitEngine(this);
    }
}
