package structural.bridge;

// The concrete class for a diesel car
class DieselCar extends Car {
    public DieselCar(Engine engine) {
        super(engine);
    }

    public void start() {
        engine.startEngine();
        System.out.println("Diesel car started.");
    }

    public void stop() {
        engine.stopEngine();
        System.out.println("Diesel car stopped.");
    }
}
