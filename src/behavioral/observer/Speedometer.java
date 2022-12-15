package behavioral.observer;

public class Speedometer implements Observer {
    private int speed;

    // Update the speed when notified by the subject
    public void update(int speed) {
        this.speed = speed;
        display();
    }

    // Display the current speed
    public void display() {
        System.out.println("Current speed: " + speed);
    }
}
