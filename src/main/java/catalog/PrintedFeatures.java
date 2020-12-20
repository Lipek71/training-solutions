package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintedFeatures implements Feature {
    List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("Empty list");
        }
        this.authors = authors;
        if (numberOfPages < 1) {
            throw new IllegalArgumentException("Wrong number");
        }
        this.numberOfPages = numberOfPages;
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (String contributor : authors) {
            contributors.add(contributor);
        }
        return contributors;
    }


    public static void main(String[] args) {
        PrintedFeatures audioFeatures = new PrintedFeatures("Harry Potter", 600, Arrays.asList("J.K. Rowling", "Someoneelse"));
        System.out.println(audioFeatures.getContributors().toString());
    }
}
