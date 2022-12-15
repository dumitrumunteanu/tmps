package behavioral.visitor;

// CarPartVisitor interface
public interface CarPartVisitor {
    void visitEngine(Engine engine);

    void visitTire(Tire tire);
    // You can add more visit methods for different types of car parts here
}
