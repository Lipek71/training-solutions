package searching;

import java.util.Arrays;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (author == null || author.isEmpty() || title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }

        Arrays.sort(bookArray);
        Book search = new Book(author, title);
        int index = Arrays.binarySearch(bookArray, search);
        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }

        return bookArray[index];
    }

}
