package initializer;

import initalizer.Currency;

public class Rate {

    private initalizer.Currency currency;

    private double conversionFactor;

    public Rate(initalizer.Currency currency, double conversionFactor) {
        this.currency = currency;
        this.conversionFactor = conversionFactor;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}