package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        StartCarHandler startCarHandler = new StartCarHandler();
        StopCarHandler stopCarHandler = new StopCarHandler();
        CheckFuelLevelHandler checkFuelLevelHandler = new CheckFuelLevelHandler();

        startCarHandler.setNextHandler(stopCarHandler);
        stopCarHandler.setNextHandler(checkFuelLevelHandler);

        // Create a request to start the car
        CarRequest startRequest = new CarRequest("start");

        // Pass the request to the start car handler, which will handle it or pass it on to the next handler in the chain
        CarResponse response = startCarHandler.handleRequest(startRequest);

        if (response.isSuccess()) {
            // Request was handled successfully
            System.out.println("Request handled successfully: " + response.getAdditionalInformation());
        } else {
            // Request was not handled successfully
            System.out.println("Request not handled successfully");
        }

    }
}
