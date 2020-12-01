package week06.d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public ProductSum getProductByCategory(List<Product> products) {
        int frozen = 0;
        int dairy = 0;
        int bakedgoods = 0;
        int other = 0;
        for (Product product : products) {
            switch (product.getCategory()) {
                case DAIRY:
                    ++dairy;
                    break;
                case OTHER:
                    ++other;
                    break;
                case FROZEN:
                    ++frozen;
                    break;
                case BAKEDGOODS:
                    ++bakedgoods;
                    break;
            }
        }
        ProductSum productSum = new ProductSum(frozen, dairy, bakedgoods, other);
        return productSum;
    }
}



