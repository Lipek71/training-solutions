package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book foundBook = null;
        for (Book book : books) {
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)){
                foundBook = book;
            }
        }
        return foundBook;
    }

    public Book findBook(List<Book> books, Book book) {
        Book foundBook = null;
        for (Book book1 : books) {
            if(book1.hashCode()==book.hashCode()){
                foundBook = book;
                System.out.println("Találtam");
            } else {
                System.out.println("Nem találtam");
            }
        }
        return foundBook;
    }



    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> bookSet = new HashSet<>();
        for(Book book : books){
            bookSet.add(book);
        }
        return bookSet;
    }
}
