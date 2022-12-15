package behavioral.command;

public class Car {

    // other car attributes and methods

    public void executeCommand(Command command) {
        command.execute();
    }

    public void brake() {
        System.out.println("Car is braking");
    }
}
