package genericsuseage.withoutgenerics;

import genericsuseage.Book;

import java.util.List;

public class Library {
    public Book getFirstBook(List books){
        if (books == null) {
            throw new NullPointerException("Not find any list!");
        }
        if (books.isEmpty()){
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        Object object = books.get(0);
        if (!(object instanceof Book)) {
            System.out.println((object instanceof Book) + " Book");
            System.out.println((object instanceof String) + " String");
            throw new ClassCastException("Not a book");
        }
        return (Book) object;
    }
}