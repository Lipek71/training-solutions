package iowriter.music;

public class Band {
    private String name;
    private int year;

    public Band(String bandName, int year) {
        this.name = bandName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
