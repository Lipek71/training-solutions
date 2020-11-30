package week06.d01;

import controladvanced.duplicates.Duplicates;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatedSumTest {

    @Test
    public void SumTest() {
        assertEquals(Arrays.asList(18.17, -11.56), new SeparatedSum().sum("3,2;4,8;-3,6;-4,4;5,5;-3,56;4,67"));
    }

    @Test
    public void SumTest2() {
        assertEquals(2, new SeparatedSum().sum2("3,2;4,8;-3,6;-4,4;5,5;-3,56;4,67").length);
    }

    @Test
    public void SumTest3() {
        assertEquals("18.17, -11.56", new SeparatedSum().sum3("3,2;4,8;-3,6;-4,4;5,5;-3,56;4,67"));
    }
}