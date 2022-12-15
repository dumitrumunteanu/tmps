# Chain of Responsibility

---

The chain of responsibility design pattern is a behavioral design pattern that is used to create a chain of objects that can handle a request. The pattern allows for the request to be handled by the first object in the chain that can handle it, without the sender of the request knowing which object in the chain will handle it. This can be useful for creating a system where different objects can handle different requests, and the request can be handled by the appropriate object without the sender of the request needing to know which object will handle it.

To implement the chain of responsibility design pattern, you can create a CarHandler interface that defines the methods that all objects in the chain must implement. This interface could include a handleRequest() method that takes a CarRequest object as an argument and returns a CarResponse object.
```java
public interface CarHandler {
    CarResponse handleRequest(CarRequest request);
}
```

You can then create a CarRequest class that represents a request to be handled by the chain of objects. This class could include information about the type of request, such as whether it is a request to start the car, stop the car, or check the fuel level.
```java
public class CarRequest {
  private String requestType;

  public CarRequest(String requestType) {
    this.requestType = requestType;
  }

  public String getRequestType() {
    return requestType;
  }
}

```

Next, you can create a CarResponse class that represents the response from the objects in the chain after a request has been handled. This class could include information about the status of the request and any additional information that the objects in the chain may have added.
```java
public class CarResponse {
  private boolean success;
  private String additionalInformation;

  public CarResponse(boolean success, String additionalInformation) {
    this.success = success;
    this.additionalInformation = additionalInformation;
  }

  public boolean isSuccess() {
    return success;
  }

  public String getAdditionalInformation() {
    return additionalInformation;
  }
}
```

You can then create concrete implementations of the CarHandler interface for each of the objects in the chain. For example, you could create a StartCarHandler class that implements the handleRequest() method to handle requests to start the car.
```java
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
```

You can create similar classes for the other objects in the chain, such as a StopCarHandler and a CheckFuelLevelHandler, each with their own implementation of the handleRequest() method.

To use the chain of responsibility design pattern, you can create an instance of each of the CarHandler implementations and set the next handler for each one. In this laboratory work, I do the following:
```java
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
```

In this example, the StartCarHandler will handle the request to start the car and return a success response, because it is the first object in the chain that can handle the request. If the request had been a request to stop the car or check the fuel level, it would have been passed on to the next object in the chain until it was handled by the appropriate object.
