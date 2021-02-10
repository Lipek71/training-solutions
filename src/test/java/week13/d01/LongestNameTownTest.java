package week13.d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestNameTownTest {

    @Test
    void getLongestNameTown() {
        LongestNameTown longestNameTown = new LongestNameTown();
        assertEquals("Tiszavárkonyi Szőlők", longestNameTown.getLongestNameTown());
    }
}