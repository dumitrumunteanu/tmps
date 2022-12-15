package behavioral.chainOfResponsibility;

public class StartCarHandler implements CarHandler {
    private CarHandler nextHandler;

    @Override
    public CarResponse handleRequest(CarRequest request) {
        if (request.getRequestType().equals("start")) {
            // Start the car and return a success response
            return new CarResponse(true, "Car started successfully");
        } else {
            // Pass the request to the next handler in the chain
            return nextHandler.handleRequest(request);
        }
    }

    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
