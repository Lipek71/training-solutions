package stringconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public boolean isEmpty(String name) {
        boolean isEmptyName = false;
        if (name == null || name.isEmpty() || name.isBlank()) {
            isEmptyName = true;
        }
        return isEmptyName;
    }

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;

        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        String titleModify;
        if (title == null) {
            titleModify = "";
        } else {
            titleModify = title.toString();
        }
        if (isEmpty(titleModify)) {
            return givenName + " " + middleName + " " + familyName;
        } else if (isEmpty(middleName)) {
            return titleModify.substring(0, 1) + titleModify.substring(1).toLowerCase() + ". " + givenName + " " + familyName;
        } else {
            return titleModify.substring(0, 1) + titleModify.substring(1).toLowerCase() + ". " + givenName + " " + middleName + " " + familyName;
        }
    }

    public String concatNameHungarianStyle() {
        String titleModify;
        if (title == null) {
            titleModify = "";
        } else {
            titleModify = title.toString();
        }
        if (isEmpty(titleModify)) {
            return familyName + " " + middleName + " " + givenName;
        } else if (isEmpty(middleName)) {
            return titleModify.substring(0, 1) + titleModify.substring(1).toLowerCase() + ". " + familyName + " " + givenName;
        } else {
            return titleModify.substring(0, 1) + titleModify.substring(1).toLowerCase() + ". " + familyName + " " + middleName + " " + givenName;
        }

    }}
