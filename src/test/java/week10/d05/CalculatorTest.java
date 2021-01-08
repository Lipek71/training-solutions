package week10.d05;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void findMinMaxSumTest() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.findMinMaxSum(new int[]{5, 4, -9, 2, 1}).getMax());
        assertEquals(-2, calculator.findMinMaxSum(new int[]{5, 4, -9, 2, 1}).getMin());
    }

    @Test
    void findSorterTest() {
        Calculator calculator = new Calculator();
        assertEquals(-9, calculator.sorter(new int[]{5, 4, -9, 2, 1})[0]);
        assertEquals(5, calculator.sorter(new int[]{5, 4, -9, 2, 1})[4]);
    }

    @Test
    void outputTest() {
        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        System.out.println("Foofoofoo!");
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        System.out.println("Here: " + baos.toString());
    }
}