package structural.decorator;

// The NitroDecorator class
class NitroDecorator implements Car {
    private Car car;
    private int boost;

    public NitroDecorator(Car car, int boost) {
        this.car = car;
        this.boost = boost;
    }

    public void start() {
        car.start();
        System.out.println("Injecting nitrous oxide.");
    }

    public void stop() {
        car.stop();
        System.out.println("Releasing nitrous oxide.");
    }

    public void setName(String name) {
        car.setName(name);
    }

    public String getName() {
        return car.getName();
    }

    public void setSpeed(int speed) {
        car.setSpeed(speed + boost);
    }

    public int getSpeed() {
        return car.getSpeed();
    }
}
