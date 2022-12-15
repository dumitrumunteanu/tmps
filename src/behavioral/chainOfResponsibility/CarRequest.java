package behavioral.chainOfResponsibility;

public class CarRequest {
    private String requestType;

    public CarRequest(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestType() {
        return requestType;
    }
}
