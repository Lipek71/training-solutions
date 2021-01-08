package week10.d05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinMaxSumTest() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.findMinMaxSum(new int[]{5,4,-9,2,1}).getMax());
        assertEquals(-2, calculator.findMinMaxSum(new int[]{5,4,-9,2,1}).getMin());
    }

}