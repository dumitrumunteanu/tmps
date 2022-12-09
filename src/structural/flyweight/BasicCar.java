package structural.flyweight;

// The BasicCar class
class BasicCar implements Car {
    private String name;
    private int speed;

    public void start() {
        System.out.println("Starting car.");
    }

    public void stop() {
        System.out.println("Stopping car.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
