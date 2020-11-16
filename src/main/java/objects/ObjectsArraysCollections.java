package objects;

import java.util.Arrays;
import java.util.List;

public class ObjectsArraysCollections {
    public static void main(String[] args) {
        Book[] books = {new Book(), new Book(), new Book()};
        List<Book> booksList = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> emptyBookList = null;
        emptyBookList.add(new Book());
        emptyBookList.add(new Book());
        emptyBookList.add(new Book());
    }
}
