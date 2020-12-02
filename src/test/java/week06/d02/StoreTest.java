package week06.d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StoreTest {
    @Test
    void StoreTest1() {
        Product product01 = new Product("Fishfingers", Category.FROZEN, 700);
        Product product02 = new Product("Strawberry", Category.FROZEN, 500);
        Product product03 = new Product("Croissant", Category.BAKEDGOODS, 200);
        Product product04 = new Product("Bread", Category.BAKEDGOODS, 350);
        Product product05 = new Product("Buns", Category.BAKEDGOODS, 30);
        Product product06 = new Product("Milk", Category.DAIRY, 250);
        Product product07 = new Product("Yoghurt", Category.DAIRY, 120);
        Product product08 = new Product("Sour cream", Category.DAIRY, 250);
        Product product09 = new Product("Beef", Category.FROZEN, 1500);
        Product product10 = new Product("Milk slice", Category.DAIRY, 150);

        List<Product> productList = new ArrayList<>();
        productList.add(product01);
        productList.add(product02);
        productList.add(product03);
        productList.add(product04);
        productList.add(product05);
        productList.add(product06);
        productList.add(product07);
        productList.add(product08);
        productList.add(product09);
        productList.add(product10);

        Store store = new Store(productList);

        assertEquals(3,store.getProductByCategory(productList).getBakedgoods());
        assertEquals(0,store.getProductByCategory(productList).getOther());
        assertEquals(4,store.getProductByCategory(productList).getDairy());
        assertEquals(3,store.getProductByCategory(productList).getFrozen());
    }
}
