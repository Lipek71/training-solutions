package ioreader.states;

public class State {
    private String statename;
    private String capital;

    public State(String statename, String capital) {
        this.statename = statename;
        this.capital = capital;
    }

    public String getStateName() {
        return statename;
    }

    public String getCapital() {
        return capital;
    }
}
