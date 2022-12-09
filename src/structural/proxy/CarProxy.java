package structural.proxy;

// The CarProxy class
class CarProxy implements Car {
    private BasicCar car;

    public void start() {
        if (car == null) {
            car = new BasicCar();
        }

        car.start();
    }

    public void stop() {
        if (car == null) {
            car = new BasicCar();
        }

        car.stop();
    }

    public void setName(String name) {
        if (car == null) {
            car = new BasicCar();
        }

        car.setName(name);
    }

    public String getName() {
        if (car == null) {
            car = new BasicCar();
        }

        return car.getName();
    }

    public void setSpeed(int speed) {
        if (car == null) {
            car = new BasicCar();
        }

        car.setSpeed(speed);
    }

    public int getSpeed() {
        if (car == null) {
            car = new BasicCar();
        }

        return car.getSpeed();
    }
}
