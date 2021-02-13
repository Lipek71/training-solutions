package week14.d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TransformersTest {

    @Test
    void mapTest() {
        assertEquals("[2, 3, 4]", new Transformers().map(Arrays.asList(1, 2, 3), (value) -> value +1).toString());
    }

    @Test
    void reduceTest() {
        assertEquals(6, new Transformers().reduce(Arrays.asList(1,2,3), 0, Integer::sum));
    }
}