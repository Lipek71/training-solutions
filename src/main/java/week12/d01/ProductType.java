package week12.d01;

import java.math.BigDecimal;

public class ProductType implements Comparable<ProductType> {
    private int weight;
    private int price;

    public ProductType(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    private BigDecimal getRate() {
        return BigDecimal.valueOf(price).divide(BigDecimal.valueOf(weight));
    }

    @Override
    public int compareTo(ProductType o) {
        return getRate().compareTo(o.getRate());
    }
}

