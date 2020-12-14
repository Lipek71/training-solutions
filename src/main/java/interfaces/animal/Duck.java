package interfaces.animal;

public class Duck implements Animal{
    private int NumberOfLegs = 2;
    private String name = "Duck";

    @Override
    public int getNumberOfLegs() {
        return this.NumberOfLegs;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
