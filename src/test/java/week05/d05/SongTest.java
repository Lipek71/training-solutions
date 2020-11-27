package week05.d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SongTest {
    @Test
    public void test1Song(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Song("", 150, ""));
        assertEquals("Song name or artist is invalid!", ex.getMessage());
    }
    @Test
    public void test2Song(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Song("Szállj el kismadár", 0, "Republic"));
        assertEquals("Song length is invalid!", ex.getMessage());
    }
}
