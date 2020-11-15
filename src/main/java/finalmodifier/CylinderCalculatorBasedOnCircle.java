package finalmodifier;

public class CylinderCalculatorBasedOnCircle {
    CircleCalculator circleCalculator = new CircleCalculator();

    double calculateVolume(double r, double h) {
        return h * circleCalculator.calculateArea(r);
    }

    double calculateSurfaceArea(double r, double h) {
        return h * circleCalculator.calculatePerimeter(r) + 2.0 * circleCalculator.calculateArea(r);
    }
}
