package week12.d01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsPacker {
    int packGoods(int[][] types, int capacity) {
        List<ProductType> productTypes = typesToList(types);
        Collections.sort(productTypes);
        Collections.reverse(productTypes);
        int weightSum = 0;
        int priceSum = 0;
        for (ProductType productType : productTypes) {
            while (weightSum + productType.getWeight() <= capacity) {
                weightSum += productType.getWeight();
                priceSum += productType.getPrice();
            }
        }
        return priceSum;
    }

    private List<ProductType> typesToList(int[][] types) {
        if (types == null) {
            throw new IllegalArgumentException("types were null");
        }
        List<ProductType> result = new ArrayList<>();
        for (int[] type : types) {
            result.add(new ProductType(type[0], type[1]));
        }
        return result;
    }


}

