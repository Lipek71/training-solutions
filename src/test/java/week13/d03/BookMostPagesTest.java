package week13.d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookMostPagesTest {

    @Test
    void getMostPagesBook() {
        Book book1 = new Book("Verne Gyula", "Észak dél ellen", 346);
        Book book2 = new Book("Rejtő Jenő", "Az ellopott cirkáló", 296);
        Book book3 = new Book("Verne Gyula", "Sándor Mátyás", 432);
        Book book4 = new Book("Rejtő Jenő", "A megkerült cirkáló", 321);
        Book book5 = new Book("Victor Hugo", "Monte Cristo Grófja", 1346);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        BookMostPages bookMostPages = new BookMostPages();
        System.out.println(bookMostPages.getMostPagesBook(books));
    }
}