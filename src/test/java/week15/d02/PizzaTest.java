package week15.d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void testFindWorstDay() {
        Pizza pizza = new Pizza();
        pizza.loadFromFile();
        assertEquals(LocalDate.of(2020,12,3), pizza.findWorstDay());
    }

    @Test
    void testFindOrder() {
        Pizza pizza = new Pizza();
        pizza.loadFromFile();

        assertEquals("Optional[Order{date=2020-12-01, time=12:30, driver='FUT_1', address='1113 Petőfi 12'}]", pizza.findOrder(LocalDate.of(2020,12,1), LocalTime.of(12,30)).toString());
        assertEquals("Optional.empty" , pizza.findOrder(LocalDate.of(2020,12,1), LocalTime.of(12,33)).toString());
    }

    @Test
    void testGetStatisticByDriver() {
        Pizza pizza = new Pizza();
        pizza.loadFromFile();

        assertEquals("{FUT_1=7, FUT_2=5, FUT_3=2, FUT_4=2}", pizza.getStatisticByDriver().toString());
    }

    @Test
    void testGetMostPopularAddress() {
        Pizza pizza = new Pizza();
        pizza.loadFromFile();

        assertEquals("1114 Kossuth 9", pizza.getMostPopularAddress().toString());
    }
}