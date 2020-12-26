package ioreadstring.names;

public class Human {
private String lastName;
private String firstName;

    public Human(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
