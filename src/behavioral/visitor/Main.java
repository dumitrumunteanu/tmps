package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        // Create a car with an engine and four tires
        Car car = new Car();
        car.addCarPart(new Engine());
        car.addCarPart(new Tire());
        car.addCarPart(new Tire());
        car.addCarPart(new Tire());
        car.addCarPart(new Tire());

        // Create a CarPartVisitor that inspects each car part
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

        // Have the car accept the visitor to inspect each car part
        car.accept(visitor);
    }
}
