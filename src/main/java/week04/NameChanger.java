package week04;

public class NameChanger {
    private String fullNameString;

    public NameChanger(String fullNameString) {
        if(fullNameString.isBlank() || fullNameString.isEmpty() || fullNameString == null){
            throw new IllegalArgumentException("Invalid Name: " + fullNameString);
        }
        this.fullNameString = fullNameString;
    }
    public void changeFirstName(String firstName){
        String oldName;
        oldName=fullNameString.substring(0, fullNameString.indexOf(" ") + 1);
        fullNameString.replaceFirst(oldName,firstName);
    }

    public String getFullNameString() {
        return fullNameString;
    }
}

