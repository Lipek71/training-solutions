package interfaces.animal;

public class Lion implements Animal {
    private int NumberOfLegs = 4;
    private String name = "Lion";

    @Override
    public int getNumberOfLegs() {
        return this.NumberOfLegs;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
