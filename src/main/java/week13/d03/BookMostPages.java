package week13.d03;

import java.util.*;

public class BookMostPages {


    public Book getMostPagesBook(List<Book> books) {
        /*int maxPage = 0;
        Book maxPageBook = null;
        for (Book book : books) {
            if (book.getNumberOfPages() > maxPage) {
                maxPage = book.getNumberOfPages();
                maxPageBook = book;
            }
        }
        return maxPageBook;*/
        return books.stream().max(Comparator.comparing(Book::getNumberOfPages)).get();
    }
}
