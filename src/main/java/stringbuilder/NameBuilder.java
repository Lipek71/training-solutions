package stringbuilder;

public class NameBuilder {
    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        isValid(familyName);
        isValid(givenName);
        StringBuilder nameBuilder = new StringBuilder("");
        if (title != null) {
            nameBuilder.append(title.getTitleString()).append(" ").append(givenName).append(" ");
        } else {
            nameBuilder.append(givenName).append(" ");
        }
        if (middleName != null && !"".equals(middleName)) {
            nameBuilder.append(middleName).append(" ");
        }
        nameBuilder.append(familyName);
        return nameBuilder.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {
        isValid(familyName);
        isValid(givenName);
        StringBuilder nameBuilder = new StringBuilder("");
        if (title != null) {
            nameBuilder.append(title.getTitleString()).append(" ").append(familyName).append(" ");
        } else {
            nameBuilder.append(familyName).append(" ");
        }
        if (middleName != null && !"".equals(middleName)) {
            nameBuilder.append(middleName).append(" ");
        }
        nameBuilder.append(givenName);
        return nameBuilder.toString();
    }

    public String insertTitle(String name, Title title, String where) {
        StringBuilder insertPart = new StringBuilder(name);
        int index = insertPart.indexOf(where);
        insertPart.insert(index + 1, (title.getTitleString() + " "));
        return insertPart.toString();
    }

    public String deleteNamePart(String name, String delete) {
        StringBuilder deletePart = new StringBuilder(name);
        int index = name.indexOf(delete);
        deletePart.delete(index, index + delete.length());
        return deletePart.toString();
    }

    void isValid(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
    }
}
