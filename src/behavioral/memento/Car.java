package behavioral.memento;

public class Car {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public CarMemento saveState() {
        return new CarMemento(state);
    }

    public void restoreState(CarMemento memento) {
        this.state = memento.getState();
    }
}

