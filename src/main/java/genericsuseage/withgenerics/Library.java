package genericsuseage.withgenerics;

import genericsuseage.Book;

import java.util.List;

public class Library {
    public Book getFirstBook(List<Book> books){
        if (books == null) {
            throw new NullPointerException("Not find any list!");
        }
        if (books.isEmpty()){
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        return books.get(0);
    }
}
