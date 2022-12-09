package structural.bridge;

// The implementation class for a petrol engine
class PetrolEngine implements Engine {
    public void startEngine() {
        System.out.println("Starting petrol engine.");
    }

    public void stopEngine() {
        System.out.println("Stopping petrol engine.");
    }
}
