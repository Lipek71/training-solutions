package collectionsset.collectionshashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {
    public Set<String> filterUniqueStrings(Collection<String> stringCollection){
        Set<String> uniqueStrings = new HashSet<>();

        for(String str : stringCollection){
            uniqueStrings.add(str);
        }
        return uniqueStrings;
    }
    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB){
        Set<String> identicalStrings = new HashSet<>();
        if (setA.size() >= setB.size()){
            for (String str : setA){
                if (setB.contains(str)){
                    identicalStrings.add(str);
                }
            }
        } else {
            for (String str : setB){
                if (setA.contains(str)){
                    identicalStrings.add(str);
                }
            }
        }
        return identicalStrings;
    }
}
