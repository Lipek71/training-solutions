package introexception.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException("Name is empty or null");
        }
        if (yearOfBirth < 1900){
            throw new IllegalArgumentException("YearOfBirth too old");
        }
        if(!new SsnValidator().isValidSsn(socialSecurityNumber)){
            throw new IllegalArgumentException("SSN is not valid");
        }

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
