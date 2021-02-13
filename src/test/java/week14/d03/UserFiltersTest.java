package week14.d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UserFiltersTest {

    @Test
    void createFilterTest() {
        final UserFilter filter = new UserFilters().createFilter(Arrays.asList(
                (user) -> user.getAge() > 18,
                (user) -> user.getName().startsWith("A")
        ));
        assertEquals("[User{name='Attila', age=19, address='Kazmer utca 4'}, User{name='Abigel', age=21, address='Nagy utca 5'}]", filter.filter(new ArrayList<>(Arrays.asList(
                new User("Marton", 16, "Racz Aladar utca 99/b"),
                new User("Attila", 19, "Kazmer utca 4"),
                new User("Anna", 17, "Mezo utca 5"),
                new User("Abigel", 21, "Nagy utca 5")
        ))).toString());
    }

    @Test
    void createFilter2Test() {
        final UserFilter filter2= new UserFilters().createFilter2(Arrays.asList(
                (user) -> user.getAge() > 18,
                (user) -> user.getName().startsWith("A"),
                (user) -> user.getAddress().toLowerCase().contains("m")
        ));
        assertEquals("[User{name='Attila', age=19, address='Kazmer utca 4'}]", filter2.filter(new ArrayList<>(Arrays.asList(
                new User("Marton", 16, "Racz Aladar utca 99/b"),
                new User("Attila", 19, "Kazmer utca 4"),
                new User("Anna", 17, "Mezo utca 5"),
                new User("Abigel", 21, "Nagy utca 5")
        ))).toString());
    }
}