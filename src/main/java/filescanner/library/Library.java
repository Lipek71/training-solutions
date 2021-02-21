package filescanner.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books = new ArrayList<>();
    public void loadFromFile() {
        String regNum;
        String author;
        String title;
        int yearOfPublish;
        try (Scanner scanner = new Scanner(Library.class.getResourceAsStream("/books_old.csv"))) {
            scanner.useDelimiter(";|(\r\n)");
            while (scanner.hasNextLine()) {
                regNum = scanner.next();
                author = scanner.next();
                title = scanner.next();
                yearOfPublish = scanner.nextInt();
                books.add(new Book(regNum, author, title, yearOfPublish));
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.loadFromFile();
    }
}
