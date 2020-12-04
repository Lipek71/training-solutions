package week06.d04;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShoppingCartTest {
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void addItemTest1() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Alma", 10);
        assertEquals(1, shoppingCart.getItems().size());
    }

    @Test
    public void addItemTest2() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Alma", 10);
        shoppingCart.addItem("Körte", 15);
        shoppingCart.addItem("Dinnye", 2);
        shoppingCart.addItem("Barack", 20);
        shoppingCart.addItem("Narancs", 10);
        assertEquals("[Alma, 10, Körte, 15, Dinnye, 2, Barack, 20, Narancs, 10]", shoppingCart.getItems().toString());
    }

    @Test
    public void addItemTest3() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Alma", 10);
        shoppingCart.addItem("Körte", 15);
        shoppingCart.addItem("Dinnye", 2);
        shoppingCart.addItem("Barack", 20);
        shoppingCart.addItem("Narancs", 10);
        shoppingCart.addItem("Alma", 15);
        shoppingCart.addItem("Barack", 10);
        assertEquals("[Alma, 25, Körte, 15, Dinnye, 2, Barack, 30, Narancs, 10]", shoppingCart.getItems().toString());
    }

    @Test
    public void addItemTest4() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Alma", 10);
        shoppingCart.addItem("Körte", 15);

        assertEquals(10, shoppingCart.getItem("Alma"));
    }

    @Test
    public void addItemTest5() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Alma", 10);
        shoppingCart.addItem("Körte", 15);

        assertEquals(0, shoppingCart.getItem("Banán"));
    }

    @Test
    public void addItemTest6() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ShoppingCart().addItem(null, 1));
        assertEquals("Name is null or empty!", ex.getMessage());
    }
}



