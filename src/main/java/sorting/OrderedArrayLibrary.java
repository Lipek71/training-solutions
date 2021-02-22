package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary {

    private final Book[] bookArray;

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

        //Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);

        Book[] sortedByTitle = new Book[getBookArray().length];
        System.arraycopy(getBookArray(), 0, sortedByTitle, 0, bookArray.length);
        Arrays.sort(sortedByTitle, Comparator.comparing(Book::getTitle));
        return sortedByTitle;
    }
}
