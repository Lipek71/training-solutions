package week08.d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {
    @Test

    public void getShortestWordsTest() {
        StringLists stringLists = new StringLists();
        assertEquals("[t]",stringLists.getShortestWords(List.of("aaa", "bb", "cc", "eeeee", "rrrr", "t")).toString());
    }

    @Test
    public void getShortestWordsTest2() {
        StringLists stringLists = new StringLists();
        assertEquals(2,stringLists.getShortestWords(List.of("aaa", "bb", "cc", "eeeee", "rrrr")).size());
    }
}