package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        // create a brake command
        Command brakeCommand = new BrakeCommand(myCar);

        // execute the brake command
        myCar.executeCommand(brakeCommand);
    }
}
