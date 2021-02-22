package sorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class OrderedArrayLibrary {

    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public Book[] sortingById() {
        Book[] sortedById = new Book[getBookArray().length];
        System.arraycopy(getBookArray(), 0, sortedById, 0, bookArray.length);
        Arrays.sort(sortedById);
        return sortedById;
    }

    public Book[] sortingByTitle() {

        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);

        Book[] sortedByTitle = new Book[getBookArray().length];
        System.arraycopy(getBookArray(), 0, sortedByTitle, 0, bookArray.length);
        Arrays.sort(sortedByTitle, titleComparator);
        return sortedByTitle;
    }
}
