package iofilestest.cheese;

public class Cheese {
    private String name;
    private double lactoz;

    public Cheese(String name, double lactoz) {
        this.name = name;
        this.lactoz = lactoz;
    }

    public String getName() {
        return name;
    }

    public double getLactoz() {
        return lactoz;
    }

    @Override
    public String toString() {
        return getName() + "," + getLactoz();
    }
}
