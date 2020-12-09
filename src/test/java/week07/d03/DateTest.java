package week07.d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    public void DateTest1(){
        Date date = new Date(2020, 12, 9);
        assertEquals("2020-12-9", date.toString());
    }
    @Test
    public void DateTest2(){
        Date date = new Date(2020, 12, 9);
        Date date2 = date.withDay(15);
        assertEquals("2020-12-15", date2.toString());
    }
}