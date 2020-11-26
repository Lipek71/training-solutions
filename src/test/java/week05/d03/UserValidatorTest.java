package week05.d03;

import org.junit.jupiter.api.Test;
import schoolrecords.ClassRecords;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {

    @Test
    public void emptyUserName() throws IllegalArgumentException {

        UserValidator userValidator = new UserValidator();
        userValidator.userList.add(new User("", 30));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> userValidator.validate(userValidator.userList));
        assertEquals("User name is empty, or null!", ex.getMessage());

    }

    @Test
    public void nullUserName() throws IllegalArgumentException {

        UserValidator userValidator = new UserValidator();
        userValidator.userList.add(new User(null, 30));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> userValidator.validate(userValidator.userList));
        assertEquals("User name is empty, or null!", ex.getMessage());

    }
    @Test
    public void highUserAge() throws IllegalArgumentException {

        UserValidator userValidator = new UserValidator();
        userValidator.userList.add(new User("Lipka", 130));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> userValidator.validate(userValidator.userList));
        assertEquals("User age too low or too high!", ex.getMessage());

    }

    @Test
    public void hlwighUserAge() throws IllegalArgumentException {

        UserValidator userValidator = new UserValidator();
        userValidator.userList.add(new User("Lipka", -30));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> userValidator.validate(userValidator.userList));
        assertEquals("User age too low or too high!", ex.getMessage());

    }

    @Test
    public void nullUser() throws IllegalArgumentException {

        UserValidator userValidator = new UserValidator();
        userValidator.userList.add(null);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> userValidator.validate(userValidator.userList));
        assertEquals("User is null!", ex.getMessage());

    }

    @Test
    public void nullUserList() throws IllegalArgumentException {

        UserValidator userValidator = new UserValidator();
        userValidator.userList=null;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> userValidator.validate(userValidator.userList));
        assertEquals("UserList is null!", ex.getMessage());

    }

}
