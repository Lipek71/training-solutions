package week08.d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleStoreTest {

    @Test
    void test1GetTitlesOfExamples() {
        ExampleStore exampleStore = new ExampleStore();
        assertEquals(4, exampleStore.getTitlesOfExamples().size());
    }

    @Test
    void test2GetTitlesOfExamples() {
        ExampleStore exampleStore = new ExampleStore();
        assertEquals("\nHarmadik feladat", exampleStore.getTitlesOfExamples().get(2));
    }
}