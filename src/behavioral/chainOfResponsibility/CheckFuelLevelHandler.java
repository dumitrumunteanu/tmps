package behavioral.chainOfResponsibility;

public class CheckFuelLevelHandler implements CarHandler {
    private CarHandler nextHandler;

    @Override
    public CarResponse handleRequest(CarRequest request) {
        if (request.getRequestType().equals("check fuel level")) {
            // Check the fuel level of the car and return a success response with the fuel level
            int fuelLevel = checkFuelLevel();
            return new CarResponse(true, "Fuel level is: " + fuelLevel);
        } else {
            // Pass the request to the next handler in the chain
            return nextHandler.handleRequest(request);
        }
    }

    private int checkFuelLevel() {
        // Code to check the fuel level of the car goes here
        return 0;
    }

    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
