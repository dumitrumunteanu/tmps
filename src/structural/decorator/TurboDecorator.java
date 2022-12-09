package structural.decorator;

// The TurboDecorator class
class TurboDecorator implements Car {
    private Car car;
    private int boost;

    public TurboDecorator(Car car, int boost) {
        this.car = car;
        this.boost = boost;
    }

    public void start() {
        car.start();
        System.out.println("Applying turbo boost.");
    }

    public void stop() {
        car.stop();
        System.out.println("Releasing turbo boost.");
    }

    public void setName(String name) {
        car.setName(name);
    }

    public String getName() {
        return car.getName();
    }

    public void setSpeed(int speed) {
        car.setSpeed(speed);
    }

    @Override
    public int getSpeed() {
        return car.getSpeed();
    }
}
