package week11.d01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PairFinderTest {

    @Test
    void findPairsTest1() {
        PairFinder pairFinder = new PairFinder();
        assertEquals(0, pairFinder.findPairs(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void findPairsTest2() {
        PairFinder pairFinder = new PairFinder();
        assertEquals(2, pairFinder.findPairs(new int[]{1, 2, 3, 4, 5, 1, 3, 3}));
    }

    @Test
    void findPairsTest3() {
        PairFinder pairFinder = new PairFinder();
        assertEquals(3, pairFinder.findPairs(new int[]{1, 1, 1, 1, 1, 1, 1}));
    }
}