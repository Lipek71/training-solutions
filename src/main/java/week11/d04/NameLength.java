package week11.d04;

import java.util.*;

public class NameLength {
    public List<Integer> getLengths(List<String> names) {
        List<Integer> nameLengths = new ArrayList<>();
        for (String name : names) {
            if (name.toLowerCase().startsWith("j")) {
                if (!nameLengths.contains(name.length())) {
                    nameLengths.add(name.length());
                }
            }
        }
        return nameLengths;
    }

    public Set<Integer> getLengths2(List<String> names) {
        Set<Integer> nameLengths = new TreeSet<>();
        for (String name : names) {
            if (name.toLowerCase().startsWith("j")) {
                    nameLengths.add(name.length());
            }
        }
        return nameLengths;
    }
}
