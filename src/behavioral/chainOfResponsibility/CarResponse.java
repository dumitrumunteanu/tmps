package behavioral.chainOfResponsibility;

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
