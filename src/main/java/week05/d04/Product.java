package week05.d04;

public class Product {
    private long price;
    private Currency currency;

    public Product(long price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public double convertPrice(Currency currency) {
        double convertedPrice = 0.0;
        if (this.currency == currency) {
            convertedPrice = this.price;
        } else if (this.currency == Currency.USD) {
            convertedPrice = this.price * 300.0;
        } else if(this.currency == Currency.HUF) {
            convertedPrice = this.price / 300.0;
        }
        return convertedPrice;
    }

    public static void main(String[] args) {
        Product product1 = new Product(6000, Currency.HUF);
        System.out.println(product1.convertPrice(Currency.HUF));
    }
}
