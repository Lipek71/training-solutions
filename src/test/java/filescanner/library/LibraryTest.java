package filescanner.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testLoadFromFile() {
        Library library = new Library();

        library.loadFromFile();

        assertEquals(4, library.getBooks().size());
        assertEquals("Robert C. Martin", library.getBooks().get(2).getAuthor());
        assertEquals("D3491", library.getBooks().get(1).getRegNum());
        assertEquals("Design Patterns", library.getBooks().get(3).getTitle());
        assertEquals(2016, library.getBooks().get(0).getYearOfPublish());
    }
}