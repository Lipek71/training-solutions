package week14.d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserFilters {

    public UserFilter createFilter(List<Predicate<User>> predicates) {
        return users -> {
            final Iterator<User> userIter = users.iterator();
            while ((userIter.hasNext())) {
                User user = userIter.next();
                boolean shouldRemove = false;
                for (Predicate<User> predicate : predicates) {
                    if (!predicate.test(user)) {
                        shouldRemove = true;
                    }
                }
                if(shouldRemove){
                    userIter.remove();
                }
            }
            return users;
        };
    }

    public UserFilter createFilter2(List<Predicate<User>> predicates) {
        return users -> {
            return users.stream()
                    .filter(predicates.stream()
                    .reduce(a -> true, Predicate::and))
                    .collect(Collectors.toList());
        };
    }

    public static void main(String[] args) {
        final UserFilter filter = new UserFilters().createFilter(Arrays.asList(
                (user) -> user.getAge() > 18,
                (user) -> user.getName().startsWith("A")
        ));

        System.out.println(filter.filter(new ArrayList<>(Arrays.asList(
                new User("Marton", 16, "Racz Aladar utca 99/b"),
                new User("Attila", 19, "Kazmer utca 4"),
                new User("Anna", 17, "Mezo utca 5"),
                new User("Abigel", 21, "Nagy utca 5")
        ))));

        final UserFilter filter2= new UserFilters().createFilter2(Arrays.asList(
                (user) -> user.getAge() > 18,
                (user) -> user.getName().startsWith("A"),
        (user) -> user.getAddress().toLowerCase().contains("m")
        ));

        System.out.println(filter2.filter(new ArrayList<>(Arrays.asList(
                new User("Marton", 16, "Racz Aladar utca 99/b"),
                new User("Attila", 19, "Kazmer utca 4"),
                new User("Anna", 17, "Mezo utca 5"),
                new User("Abigel", 21, "Nagy utca 5")
        ))));
    }
}

