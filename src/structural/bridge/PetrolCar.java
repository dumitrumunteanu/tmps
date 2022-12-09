package structural.bridge;

// The concrete class for a petrol car
class PetrolCar extends Car {
    public PetrolCar(Engine engine) {
        super(engine);
    }

    public void start() {
        engine.startEngine();
        System.out.println("Petrol car started.");
    }

    public void stop() {
        engine.stopEngine();
        System.out.println("Petrol car stopped.");
    }
}
