package numbers;

import java.util.Locale;

public class Circle {
    private int diameter;
    private final double PI = 3.14;

    Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPI() {
        return PI;
    }

    public double perimeter() {
        return Double.parseDouble(String.format(Locale.US,"%8.2f", getPI() * (double) getDiameter()));

    }

    public double area() {
        return Double.parseDouble(String.format(Locale.US,"%8.2f",PI * ((double) diameter / 2) * ((double) diameter / 2)));
    }
}
