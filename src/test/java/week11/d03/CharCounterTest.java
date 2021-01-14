package week11.d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static week11.d03.CharCounter.countChars;

class CharCounterTest {

    @Test
    void mainTest() {
        CharCounter charCounter = new CharCounter();
        int result = countChars(new String[]{"abc", "cba", "ab", "bcra"});
        assertEquals(2,result);
    }
}