package week12.d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeSorterTest {

    @Test
    void ageSorterTest() {
        AgeSorter ageSorter = new AgeSorter();
        assertEquals(10,ageSorter.ageSorter(new int[]{50, 25, 20, 25, 30, 10, 33, 31})[0]);
        assertEquals(50,ageSorter.ageSorter(new int[]{50, 25, 20, 25, 30, 10, 33, 31})[7]);

    }
}