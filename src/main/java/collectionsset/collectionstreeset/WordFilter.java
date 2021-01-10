package collectionsset.collectionstreeset;

import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] randomStrings) {
        Set<String> filteredWords = new TreeSet<>();
        boolean unique = false;
        for (int i = 0; i < randomStrings.length; i++) {
            for (int j = i + 1; j < randomStrings.length - 1; j++) {
                if (randomStrings[i].equals(randomStrings[j])) {
                    unique = true;
                }
            }
            if (!unique) {
                filteredWords.add(randomStrings[i]);
            }
            unique = false;
        }
        return filteredWords;
    }

}
