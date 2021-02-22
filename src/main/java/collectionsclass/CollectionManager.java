package collectionsclass;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionManager {

    private final List<Book> library;

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> getLibrary() {
        return library;
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(this.library);
    } //módosíthatatlan listát eredményez

    public List<Book> reverseLibrary() {
        List<Book> reverseLibrary = Collections.unmodifiableList(library);
        Collections.sort(reverseLibrary);
        Collections.reverse(reverseLibrary);
        return reverseLibrary;
    } //az eredeti lista másolatán dolgozik!

    public Book getFirstBook() {
        //return Collections.min(library);
        return getLibrary().stream().sorted().collect(Collectors.toList()).get(0);
    }//a legrégebbi (legkisebb id) könyvet adja vissza

    public Book getLastBook() {
        //return Collections.max(library);
        return getLibrary().stream().sorted().collect(Collectors.toList()).get(library.size()-1);
    } // a legújabb (legnagyobb id) könyvet adja vissza
}
