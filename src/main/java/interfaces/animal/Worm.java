package interfaces.animal;

public class Worm implements Animal{
    private int NumberOfLegs = 0;
    private String name = "Worm";

    @Override
    public int getNumberOfLegs() {
        return this.NumberOfLegs;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
