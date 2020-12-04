package week06.d04;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(String name, int quantity) {
        int index = searchItem(name);
        if (index == -1) {
            items.add(new Item(name, quantity));
        } else {
            items.get(index).setQuantity(items.get(index).getQuantity() + quantity);
        }
    }

    public int searchItem(String name) {
        if (!items.isEmpty()) {
            int index = 0;
            for (Item itemPart : items) {
                if (itemPart.getName().equals(name)) {
                    return index;
                }
                ++index;
            }
            return -1;
        } else {
            return -1;
        }
    }

    public int getItem(String name) {
        int index = searchItem(name);
        if (index == -1) {
            return 0;
        } else {
            return items.get(index).getQuantity();
        }
    }

    public List<Item> getItems() {
        return items;
    }

}
