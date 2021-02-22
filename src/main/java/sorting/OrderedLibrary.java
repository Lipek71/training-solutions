package sorting;

import java.util.Set;
import java.util.stream.Collectors;

public class OrderedLibrary {

    Set<Book> bookSet;

    public OrderedLibrary(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Book lendFirstBook() {
        if (bookSet.isEmpty()) {
            throw new NullPointerException("Library is empty!");
        }
        return bookSet.stream().limit(1).collect(Collectors.toList()).get(0);
    }
}
