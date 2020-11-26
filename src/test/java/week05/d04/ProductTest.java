package week05.d04;

import org.junit.jupiter.api.Test;
import week05.d03.UserValidator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {
    @Test
    public void test1ConverPrice() {
        Product product1 = new Product(6000, Currency.HUF);
        assertEquals(20, product1.convertPrice(Currency.USD));
    }

    @Test
    public void test2ConverPrice() {
        Product product1 = new Product(60, Currency.USD);
        assertEquals(18000, product1.convertPrice(Currency.HUF));
    }

    @Test
    public void test3ConverPrice() {
        Product product1 = new Product(6000, Currency.HUF);
        assertEquals(6000, product1.convertPrice(Currency.HUF));
    }
}
