package behavioral.chainOfResponsibility;

public class StopCarHandler implements CarHandler {
    private CarHandler nextHandler;

    @Override
    public CarResponse handleRequest(CarRequest request) {
        if (request.getRequestType().equals("stop")) {
            // Stop the car and return a success response
            return new CarResponse(true, "Car stopped successfully");
        } else {
            // Pass the request to the next handler in the chain
            return nextHandler.handleRequest(request);
        }
    }

    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
