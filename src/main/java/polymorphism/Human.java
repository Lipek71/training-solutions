package polymorphism;

public class Human implements HasName {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human: " + "Oktató: " + name;
    }
}