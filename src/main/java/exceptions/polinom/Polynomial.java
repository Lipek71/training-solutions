package exceptions.polinom;

public class Polynomial {
    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if (coefficients == null || coefficients.length == 0) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] stringInputArray) {
        if (stringInputArray == null || stringInputArray.length == 0) {
            throw new NullPointerException("coefficientStrs is null");
        }
        try {
            double[] coefficientsConvert = new double[stringInputArray.length];
            for (int i = 0; i < stringInputArray.length; i++) {
                coefficientsConvert[i] = Double.parseDouble(stringInputArray[i]);
            }
            this.coefficients = coefficientsConvert;
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", iae);
        }
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double evaluate(double x) {
        int n = coefficients.length - 1;
        double sum = 0;
        for (int j = n; j >= 0; j--) {
            sum += coefficients[j] * Math.pow(x,(double)n - j);
        }
        return sum;
    }
}
