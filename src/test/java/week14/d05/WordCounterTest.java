package week14.d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void getWordHach() {
        WordCounter wordCounter = new WordCounter();
        assertEquals(91, wordCounter.getWordHach("src/main/java/week14/d05/hachiko.srt"));
    }
}