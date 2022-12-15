package behavioral.chainOfResponsibility;

public interface CarHandler {
    CarResponse handleRequest(CarRequest request);
}
