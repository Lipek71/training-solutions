package week13.d03;

import java.util.Objects;

class Book {
    private final String author;
    private final String title;
    private final int numberOfPages;

    public Book(String author, String title, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Könyv{" +
                "Szerző: " + author +
                ", cím: " + title +
                ", oldalak száma: " + numberOfPages +
                '}';
    }
}
