package catalog;

public class SearchCriteria {
    private String contributor;
    private String title;

    public SearchCriteria(String contributor, String title) {
        if (contributor != null && !contributor.isBlank()) {
            this.contributor = contributor;
        }
        if (title != null && !title.isBlank()) {
            this.title = title;
        }
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public static SearchCriteria createByBoth(String contributor, String title) {
        if (Validators.isBlank(contributor) || Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty parameter");
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Empty contributor");
        }
        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        return new SearchCriteria(null, title);
    }

    public boolean hasContributor() {
        return getContributor() != null && !getContributor().isBlank();
    }

    public boolean hasTitle() {
        return getTitle() != null && !getTitle().isBlank();
    }

}
