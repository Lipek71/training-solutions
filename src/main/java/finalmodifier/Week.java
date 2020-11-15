package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {

    public static void main(String[] args) {
        List<String> daysOfWeek = Arrays.asList("h", "k", "sze", "cs", "p", "szo", "v");
        System.out.println(daysOfWeek);
        daysOfWeek.set(1, "sze");
        System.out.println(daysOfWeek);

        daysOfWeek = Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
        System.out.println(daysOfWeek);
    }
}
