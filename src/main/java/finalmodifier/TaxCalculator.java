package finalmodifier;

public class TaxCalculator {
    final double ÁFA = 0.27;

    double tax(double price) {
        return price * ÁFA;
    }

    double priceWithTax(double price) {
        return price * (1.0 + ÁFA);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.tax(10000));
        System.out.println(taxCalculator.priceWithTax(10000));
    }
}
