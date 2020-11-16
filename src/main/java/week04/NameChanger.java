package week04;

public class NameChanger {
    private String fullNameString;

    public NameChanger(String fullNameString) {
        if(fullNameString.isBlank() || fullNameString.isEmpty() || fullNameString == null){
            throw new IllegalArgumentException("Invalid Name: " + fullNameString);
        }
        this.fullNameString = fullNameString;
    }
    public void changeFirstName(String fistName){
        String oldName;
        oldName=fullNameString.substring(0, fullNameString.indexOf(" ");
        fullNameString.replaceFirst(oldName,fistName);
    }

    public String getFullNameString() {
        return fullNameString;
    }
}

