package attributes.bill;

public class Item {
    private String product;
    private String quantity;
    private double price;

    public Item(String product, String quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public String getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
