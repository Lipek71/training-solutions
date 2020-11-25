package week05.d03;

import java.util.Arrays;
import java.util.List;

public class UserValidator {
    List<User> userList = Arrays.asList();


    public void validate(List<User> userList) {
        for (User itemUser : userList) {
            if (itemUser.getUserName() == null || itemUser.getUserName().isBlank()) {
                throw new IllegalArgumentException("User name is empty, or null!");
            }
            if (itemUser.getUserAge() > 120 || itemUser.getUserAge() < 0) {
                throw new IllegalArgumentException("User age too low or too high!");
            }
        }
    }

}
