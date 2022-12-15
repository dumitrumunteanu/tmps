package behavioral.command;

public class BrakeCommand implements Command {

    // reference to the car object that the command will be executed on
    private Car car;

    public BrakeCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.brake();
    }
}
