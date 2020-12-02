package week06.d03;

import org.junit.jupiter.api.Test;
import stringconcat.Employee;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SeriesTest {
    @Test
    void calculateSeriesTypeTest1() {
        assertEquals("rendezetlen", new Series().calculateSeriesType(Arrays.asList(3, 2, 1, 3)));
    }

    @Test
    void calculateSeriesTypeTest2() {
        assertEquals("csökkenő", new Series().calculateSeriesType(Arrays.asList(3, 2, 1)));
    }

    @Test
    void calculateSeriesTypeTest3() {
        assertEquals("növekvő", new Series().calculateSeriesType(Arrays.asList(1, 5, 200)));
    }

    @Test
    void calculateSeriesTypeTest4() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Series().calculateSeriesType(Arrays.asList(1)));
        assertEquals("The list is null or too short!", ex.getMessage());
    }

    @Test
    void calculateSeriesTypeTest5() {
        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> new Series().calculateSeriesType(null));
        assertEquals("The list is null or too short!", ex2.getMessage());
    }
}
