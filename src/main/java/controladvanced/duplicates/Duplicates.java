package controladvanced.duplicates;


import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public List<Integer> find(List<Integer> items) {
        List<Integer> findedItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (items.get(i).equals(items.get(j))) {
                    findedItems.add(items.get(i));
                    break;
                }
            }
        }
        return findedItems;
    }
}
