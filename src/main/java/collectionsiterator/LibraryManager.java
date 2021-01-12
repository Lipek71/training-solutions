package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {
    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {
        for (Book book : libraryBooks) {
            if (book.getRegNumber() == regNumber) {
                return book;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        int removedBook;
        for (Iterator<Book> i = libraryBooks.iterator(); i.hasNext(); ) {
            Book book = i.next();
            if(book.getRegNumber() == regNumber){
                removedBook = book.getRegNumber();
                libraryBooks.remove(book);
                return removedBook;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> selectedBooks = new HashSet<>();
        for (Book book : libraryBooks) {
            if (book.getAuthor().equals(author)) {
                selectedBooks.add(book);
            }
        }
        if (!selectedBooks.isEmpty()) {
            return selectedBooks;
        } else {
            throw new MissingBookException("No books found by " + author);
        }
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }
}
