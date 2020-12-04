package week06.d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BottleTest {

    @Test
    void bottleTest1 (){
        Bottle bottle1 = new Bottle(BottleType.GLASS_BOTTLE);
        assertEquals("GLASS_BOTTLE, 0", bottle1.toString());
    }

    @Test
    void bottleTest2 (){
        Bottle bottle1 = new Bottle(BottleType.GLASS_BOTTLE);
        bottle1.fill(100);
        assertEquals("GLASS_BOTTLE, 100", bottle1.toString());
    }

    @org.junit.Test
    public void addItemTest3() throws IllegalArgumentException {
        Bottle bottle1 = new Bottle(BottleType.GLASS_BOTTLE);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> bottle1.fill(2000));
        assertEquals("Isn't enough space in bottle!", ex.getMessage());
    }

}
