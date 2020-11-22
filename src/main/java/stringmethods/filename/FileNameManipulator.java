package stringmethods.filename;

public class FileNameManipulator {
    public char findLastCharacter(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        } else {
            return str.trim().charAt(str.trim().length() - 1);
        }
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        } else if (fileName.startsWith(".")) {
            throw new IllegalArgumentException("Invalid argument!");
        } else {
            return fileName.substring(0, fileName.indexOf(".")) + fileName.substring(fileName.indexOf(".")).toLowerCase();
        }
    }

    public String findFileExtension(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Invalid file name!");
        } else if (fileName.startsWith(".") || fileName.length() < 3) {
            throw new IllegalArgumentException("Invalid file name!");
        } else {
            return fileName.substring(fileName.indexOf(".")).toLowerCase();
        }
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        if (fileName == null || fileName.isBlank() || ext == null || ext.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        } else if (fileName.substring(0, 1) == "." || fileName.length() < 3) {
            throw new IllegalArgumentException("Invalid argument!");
        } else {
            return ext.equals(fileName.substring(fileName.indexOf(".") + 1));
        }
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (searchedFileName == null || searchedFileName.isBlank() || actualFileName == null || actualFileName.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        } else if (searchedFileName.substring(0, 1) == "." || searchedFileName.length() < 3) {
            throw new IllegalArgumentException("Invalid argument!");
        } else {
            return actualFileName.toLowerCase().equals(searchedFileName.toLowerCase());
        }
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        } else {
            return fileName.replaceAll(present, target);
        }
    }
}
