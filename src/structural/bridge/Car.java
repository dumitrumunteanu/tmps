package structural.bridge;

// The abstract Car class
abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void start();

    public abstract void stop();
}
