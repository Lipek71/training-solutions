package week07.d02;

public interface User {
    String getUserName();
    String getFirstName();
    String getLastName();
    default String getFullName(){
        return getFirstName() + " " + getLastName();
    }
}
