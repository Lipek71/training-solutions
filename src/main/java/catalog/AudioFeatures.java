package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
        if (length < 1) {
            throw new IllegalArgumentException("Wrong number");
        }
        this.length = length;
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Empty list");
        }
        this.performers = performers;

    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
        if (length < 1) {
            throw new IllegalArgumentException("Wrong number");
        }
        this.length = length;
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Empty list");
        }
        this.performers = performers;
        if (Validators.isEmpty(composer)) {
            throw new IllegalArgumentException("Empty list");
        }
        this.composer = composer;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        if (!Validators.isEmpty(composer)) {
            for (String contributor : composer) {
                contributors.add(contributor);
            }
        }
        for (String contributor : performers) {
            contributors.add(contributor);
        }
        return contributors;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        AudioFeatures audioFeatures = new AudioFeatures("Ride the Lightning", 300, Arrays.asList("Metallica"), Arrays.asList("James Hetfield"));
        System.out.println(audioFeatures.getTitle());
    }
}
