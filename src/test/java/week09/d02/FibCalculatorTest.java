package week09.d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibCalculatorTest {

    @Test
    void test1SumEvents() {
        FibCalculator fibCalculator = new FibCalculator();
        assertEquals(10, fibCalculator.sumEvens(10));
    }

    @Test
    void Test2Sumvents() {
        FibCalculator fibCalculator = new FibCalculator();
        assertEquals(44, fibCalculator.sumEvens(35));
    }
}