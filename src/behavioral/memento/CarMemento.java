package behavioral.memento;

public class CarMemento {
    private final String state;

    public CarMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
