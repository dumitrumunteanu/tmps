package structural.bridge;

// The implementation class for a diesel engine
class DieselEngine implements Engine {
    public void startEngine() {
        System.out.println("Starting diesel engine.");
    }

    public void stopEngine() {
        System.out.println("Stopping diesel engine.");
    }
}
