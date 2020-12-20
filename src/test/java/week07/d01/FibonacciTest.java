package week07.d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void test1Fib1() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fib1(0));
    }

    @Test
    void test2Fib1() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(1, fibonacci.fib1(1));
    }

    @Test
    void test3Fib1() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(1, fibonacci.fib1(2));
    }

    @Test
    void test4Fib1() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(2, fibonacci.fib1(3));
    }

    @Test
    void test5Fib1() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(21, fibonacci.fib1(8));
    }

    @Test
    void test1Fib2() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fib1(0));
    }

    @Test
    void test2Fib2() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(1, fibonacci.fib1(1));
    }

    @Test
    void test3Fib2() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(1, fibonacci.fib1(2));
    }

    @Test
    void test4Fib2() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(2, fibonacci.fib1(3));
    }

    @Test
    void test5Fib2() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(21, fibonacci.fib1(8));
    }
}